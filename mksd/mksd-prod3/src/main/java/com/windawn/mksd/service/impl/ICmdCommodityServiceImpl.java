package com.windawn.mksd.service.impl;

import com.windawn.mksd.bean.PageResult;
import com.windawn.mksd.mapper.CmdCommodityMapper;
import com.windawn.mksd.service.ICmdCommodityService;
import com.windawn.mksd.vo.CmdCommodity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class ICmdCommodityServiceImpl implements ICmdCommodityService {

    @Resource
    private CmdCommodityMapper mapper;

    @Override
    public boolean save(CmdCommodity entity) throws Exception {
        return mapper.insert(entity);
    }

    @Override
    public void update(CmdCommodity entity) throws Exception {

    }

    @Override
    public void delete(Integer id) throws Exception {

    }

    @Override
    public void delete(Long id) throws Exception {

    }

    @Override
    public CmdCommodity getById(Integer id) throws Exception {
        return null;
    }

    @Override
    public CmdCommodity getById(Long id) throws Exception {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public PageResult<CmdCommodity> findPageData(Map<String, Object> param, int pageNo, int pageSize, String orderByClause) throws Exception {
        return null;
    }

    @Override
    public List<CmdCommodity> findByMap(Map<String, Object> param) throws Exception {
        return null;
    }

    @Override
    public int countByMap(Map<String, Object> param) throws Exception {
        return 0;
    }

    @Override
    public List<CmdCommodity> findAll() {
        return mapper.selectAll();
    }
}
