package com.pachong.dao;

import com.pachong.entity.lpl_team;
import com.pachong.entity.lpl_teamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lpl_teamMapper {
    int countByExample(lpl_teamExample example);

    int deleteByExample(lpl_teamExample example);

    int deleteByPrimaryKey(Integer teamid);

    int insert(lpl_team record);

    int insertSelective(lpl_team record);

    List<lpl_team> selectByExample(lpl_teamExample example);

    lpl_team selectByPrimaryKey(Integer teamid);

    int updateByExampleSelective(@Param("record") lpl_team record, @Param("example") lpl_teamExample example);

    int updateByExample(@Param("record") lpl_team record, @Param("example") lpl_teamExample example);

    int updateByPrimaryKeySelective(lpl_team record);

    int updateByPrimaryKey(lpl_team record);
}