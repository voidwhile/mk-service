package com.windawn.mksd.mapper;

import com.windawn.mksd.vo.CmdCommodity;

import java.util.List;

public interface CmdCommodityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mk_cmd_commodity
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long cmdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mk_cmd_commodity
     *
     * @mbggenerated
     */
    boolean insert(CmdCommodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mk_cmd_commodity
     *
     * @mbggenerated
     */
    int insertSelective(CmdCommodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mk_cmd_commodity
     *
     * @mbggenerated
     */
    CmdCommodity selectByPrimaryKey(Long cmdId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mk_cmd_commodity
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CmdCommodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mk_cmd_commodity
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(CmdCommodity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mk_cmd_commodity
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CmdCommodity record);

    List<CmdCommodity> selectAll();
}