package com.tz.springbootdemo.mapper;

import com.tz.springbootdemo.po.Rizhi;
import com.tz.springbootdemo.po.RizhiExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RizhiMapper {
    int countByExample(RizhiExample example);

    int deleteByExample(RizhiExample example);

    int deleteByPrimaryKey(Integer rizhiid);

    int insert(Rizhi record);

    int insertSelective(Rizhi record);

    List<Rizhi> selectByExampleWithBLOBs(RizhiExample example);

    List<Rizhi> selectByExample(RizhiExample example);

    Rizhi selectByPrimaryKey(Integer rizhiid);

    int updateByExampleSelective(@Param("record") Rizhi record, @Param("example") RizhiExample example);

    int updateByExampleWithBLOBs(@Param("record") Rizhi record, @Param("example") RizhiExample example);

    int updateByExample(@Param("record") Rizhi record, @Param("example") RizhiExample example);

    int updateByPrimaryKeySelective(Rizhi record);

    int updateByPrimaryKeyWithBLOBs(Rizhi record);

    int updateByPrimaryKey(Rizhi record);

    List<Rizhi> selectRizhiList();
}