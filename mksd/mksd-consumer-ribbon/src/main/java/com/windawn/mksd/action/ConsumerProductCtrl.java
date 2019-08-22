package com.windawn.mksd.action;

import com.windawn.mksd.vo.CmdCommodity;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerProductCtrl {
    public static final String PROD_GET_URL = "http://MKSD-PROD/cmd/get/";
    public static final String PROD_LIST_URL = "http://MKSD-PROD/cmd/list/";
    public static final String PROD_ADD_URL = "http://MKSD-PROD/cmd/add/";
    public static final String PROD_TOPIC = "MKSD-PROD";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/prod/get")
    public Object getProd(Long id) {
        CmdCommodity cmd = restTemplate.exchange(PROD_GET_URL+id, HttpMethod.GET,new HttpEntity<Object>(httpHeaders),CmdCommodity.class).getBody();
        return cmd;
    }

    @RequestMapping("/prod/list")
    public Object listProd() {
        ServiceInstance serviceInstance = loadBalancerClient.choose(PROD_TOPIC);
        System.out.println(
                "【*** ServiceInstance ***】host = " + serviceInstance.getHost()
                        + "、port = " + serviceInstance.getPort()
                        + "、serviceId = " + serviceInstance.getServiceId());
        URI uri = URI.create(String.format("http://%s:%s/cmd/list/" ,
                serviceInstance.getHost(), serviceInstance.getPort()));

        List<CmdCommodity> list = restTemplate.exchange(uri,HttpMethod.GET,new HttpEntity<Object>(httpHeaders),List.class).getBody();
        return list;
    }

    @RequestMapping("/prod/add")
    public Object addProd(CmdCommodity cmd) {
        Boolean result = restTemplate.exchange(PROD_ADD_URL,HttpMethod.POST,new HttpEntity<Object>(cmd,httpHeaders),Boolean.class).getBody();
        return result;
    }

}
