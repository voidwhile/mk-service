package com.windawn.mksd.service.fallback;

import com.windawn.mksd.service.ICmdCommodityService;
import com.windawn.mksd.vo.CmdCommodity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ICmdCommodityServiceFallbackFactory implements FallbackFactory<ICmdCommodityService> {

    @Override
    public ICmdCommodityService create(Throwable throwable) {
        return new ICmdCommodityService() {
            @Override
            public CmdCommodity getProd(Long id) {
                CmdCommodity cmd = new CmdCommodity();
                cmd.setCmdName("feign-hystrix");
                cmd.setCmdId(0L);
                return cmd;
            }

            @Override
            public List<CmdCommodity> listProd() {
                return null;
            }

            @Override
            public boolean addProd(CmdCommodity cmd) {
                return false;
            }
        };
    }
}
