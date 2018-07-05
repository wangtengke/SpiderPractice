package com.pachong.dao;

import com.pachong.entity.musictoplist;
import com.pachong.entity.musictoplistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface musictoplistMapper {
    int countByExample(musictoplistExample example);

    int deleteByExample(musictoplistExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(musictoplist record);

    int insertSelective(musictoplist record);

    List<musictoplist> selectByExample(musictoplistExample example);

    musictoplist selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") musictoplist record, @Param("example") musictoplistExample example);

    int updateByExample(@Param("record") musictoplist record, @Param("example") musictoplistExample example);

    int updateByPrimaryKeySelective(musictoplist record);

    int updateByPrimaryKey(musictoplist record);
}