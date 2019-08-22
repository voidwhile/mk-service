package com.windawn.mksd.action;

import com.windawn.mksd.vo.CmdCommodity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/consumer")
public class ConsumerProductCtrl {
    public static final String PROD_GET_URL = "http://MKSD-PROD/cmd/get/";
    public static final String PROD_LIST_URL = "http://MKSD-PROD/cmd/list/";
    public static final String PROD_ADD_URL = "http://MKSD-PROD/cmd/add/";

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private HttpHeaders httpHeaders;

    @RequestMapping("/prod/get")
    public Object getProd(Long id) {
        CmdCommodity cmd = restTemplate.exchange(PROD_GET_URL+id, HttpMethod.GET,new HttpEntity<Object>(httpHeaders),CmdCommodity.class).getBody();
        return cmd;
    }

    @RequestMapping("/prod/list")
    public Object listProd() {
        List<CmdCommodity> list = restTemplate.exchange(PROD_LIST_URL,HttpMethod.GET,new HttpEntity<Object>(httpHeaders),List.class).getBody();
        return list;
    }

    @RequestMapping("/prod/add")
    public Object addProd(CmdCommodity cmd) {
        Boolean result = restTemplate.exchange(PROD_ADD_URL,HttpMethod.POST,new HttpEntity<Object>(cmd,httpHeaders),Boolean.class).getBody();
        return result;
    }

}
