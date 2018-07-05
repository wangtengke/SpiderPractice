package com.pachong.dao;

import com.pachong.entity.lpl_champion;
import com.pachong.entity.lpl_championExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lpl_championMapper {
    int countByExample(lpl_championExample example);

    int deleteByExample(lpl_championExample example);

    int deleteByPrimaryKey(Integer ichampionid);

    int insert(lpl_champion record);

    int insertSelective(lpl_champion record);

    List<lpl_champion> selectByExample(lpl_championExample example);

    lpl_champion selectByPrimaryKey(Integer ichampionid);

    int updateByExampleSelective(@Param("record") lpl_champion record, @Param("example") lpl_championExample example);

    int updateByExample(@Param("record") lpl_champion record, @Param("example") lpl_championExample example);

    int updateByPrimaryKeySelective(lpl_champion record);

    int updateByPrimaryKey(lpl_champion record);
}