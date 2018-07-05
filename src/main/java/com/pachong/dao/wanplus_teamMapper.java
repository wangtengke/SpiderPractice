package com.pachong.dao;

import com.pachong.entity.wanplus_team;
import com.pachong.entity.wanplus_teamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface wanplus_teamMapper {
    int countByExample(wanplus_teamExample example);

    int deleteByExample(wanplus_teamExample example);

    int insert(wanplus_team record);

    int insertSelective(wanplus_team record);

    List<wanplus_team> selectByExample(wanplus_teamExample example);

    int updateByExampleSelective(@Param("record") wanplus_team record, @Param("example") wanplus_teamExample example);

    int updateByExample(@Param("record") wanplus_team record, @Param("example") wanplus_teamExample example);
}