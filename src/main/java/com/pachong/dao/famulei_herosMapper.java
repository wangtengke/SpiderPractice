package com.pachong.dao;

import com.pachong.entity.famulei_heros;
import com.pachong.entity.famulei_herosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface famulei_herosMapper {
    int countByExample(famulei_herosExample example);

    int deleteByExample(famulei_herosExample example);

    int insert(famulei_heros record);

    int insertSelective(famulei_heros record);

    List<famulei_heros> selectByExample(famulei_herosExample example);

    int updateByExampleSelective(@Param("record") famulei_heros record, @Param("example") famulei_herosExample example);

    int updateByExample(@Param("record") famulei_heros record, @Param("example") famulei_herosExample example);
}