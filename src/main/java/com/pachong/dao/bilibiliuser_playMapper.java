package com.pachong.dao;

import com.pachong.entity.bilibiliuser_play;
import com.pachong.entity.bilibiliuser_playExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface bilibiliuser_playMapper {
    int countByExample(bilibiliuser_playExample example);

    int deleteByExample(bilibiliuser_playExample example);

    int insert(bilibiliuser_play record);

    int insertSelective(bilibiliuser_play record);

    List<bilibiliuser_play> selectByExample(bilibiliuser_playExample example);

    int updateByExampleSelective(@Param("record") bilibiliuser_play record, @Param("example") bilibiliuser_playExample example);

    int updateByExample(@Param("record") bilibiliuser_play record, @Param("example") bilibiliuser_playExample example);
}