package com.windawn.mksd.action;

import com.windawn.mksd.service.ICmdCommodityService;
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

    @Resource
    private ICmdCommodityService iCmdCommodityService;

    @RequestMapping("/prod/get")
    public Object getProd(Long id) {
        CmdCommodity cmd = iCmdCommodityService.getProd(id);
        return cmd;
    }

    @RequestMapping("/prod/list")
    public Object listProd() {
        List<CmdCommodity> list = iCmdCommodityService.listProd();
        return list;
    }

    @RequestMapping("/prod/add")
    public Object addProd(CmdCommodity cmd) {
        Boolean result = iCmdCommodityService.addProd(cmd);
        return result;
    }

}
