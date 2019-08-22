package com.windawn.mksd.test;

import com.windawn.mksd.ProdApp3;
import com.windawn.mksd.service.ICmdCommodityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = ProdApp3.class)
@RunWith(SpringRunner.class)
public class CmdCommodityServiceTest {

    @Resource
    private ICmdCommodityService service;
    @Test
    public void testGet() throws Exception{
        System.out.println(service.getById(17L).getCmdName());
    }
}
