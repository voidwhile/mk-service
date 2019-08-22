package com.windawn.mksd.service;

import com.windawn.mksd.config.FeignClientConfig;
import com.windawn.mksd.vo.CmdCommodity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "MKSD-PROD",configuration = FeignClientConfig.class)
public interface ICmdCommodityService {

    @RequestMapping("/cmd/get/{id}")
    public CmdCommodity getProd(@PathVariable("id")Long id);

    @RequestMapping("/cmd/list")
    public List<CmdCommodity> listProd();

    @RequestMapping("/cmd/add")
    public boolean addProd(CmdCommodity cmd);
}
