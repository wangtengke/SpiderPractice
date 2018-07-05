package com.pachong.dao;

import com.pachong.entity.bilibiliuser_follow;
import com.pachong.entity.bilibiliuser_followExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface bilibiliuser_followMapper {
    int countByExample(bilibiliuser_followExample example);

    int deleteByExample(bilibiliuser_followExample example);

    int insert(bilibiliuser_follow record);

    int insertSelective(bilibiliuser_follow record);

    List<bilibiliuser_follow> selectByExample(bilibiliuser_followExample example);

    int updateByExampleSelective(@Param("record") bilibiliuser_follow record, @Param("example") bilibiliuser_followExample example);

    int updateByExample(@Param("record") bilibiliuser_follow record, @Param("example") bilibiliuser_followExample example);
}