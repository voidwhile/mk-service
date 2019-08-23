package com.windawn.mksd.action;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.windawn.mksd.service.ICmdCommodityService;
import com.windawn.mksd.util.Logger;
import com.windawn.mksd.util.Slf4JLogger;
import com.windawn.mksd.vo.CmdCommodity;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cmd")
public class CmdCommodityCtrl {

    private Logger _log = Slf4JLogger.getLogger(CmdCommodityCtrl.class);

    @Resource
    private ICmdCommodityService service;

    @Resource
    private DiscoveryClient client;

    @RequestMapping("/get/{id}")
    @HystrixCommand(fallbackMethod = "getFallback")
    public Object get(@PathVariable("id")Long id) {
        CmdCommodity cmd = null;
        try {
            cmd = service.getById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (cmd == null) {
            throw new RuntimeException("该产品已下架");
        }
        return cmd;
    }

    public Object getFallback(@PathVariable("id")Long id) {
        CmdCommodity cmd = new CmdCommodity();
        cmd.setCmdName("hystrix");
        cmd.setCmdId(0L);
        return cmd;
    }


    @RequestMapping("/list")
    public Object findAll() {
        return service.findAll();
    }

    @RequestMapping("/add")
    public Object add(@RequestBody CmdCommodity cmd) {
        try {
            return service.save(cmd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @RequestMapping("/discover")
    public Object discover(){
        return this.client;
    }
}
