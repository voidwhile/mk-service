package com.windawn.mksd.service;

import com.windawn.mksd.vo.CmdCommodity;

import java.util.List;

public interface ICmdCommodityService extends IBaseService<CmdCommodity> {
    public List<CmdCommodity> findAll();
}
