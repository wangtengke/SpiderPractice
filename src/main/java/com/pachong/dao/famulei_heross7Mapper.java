package com.pachong.dao;

import com.pachong.entity.famulei_heross7;
import com.pachong.entity.famulei_heross7Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface famulei_heross7Mapper {
    int countByExample(famulei_heross7Example example);

    int deleteByExample(famulei_heross7Example example);

    int insert(famulei_heross7 record);

    int insertSelective(famulei_heross7 record);

    List<famulei_heross7> selectByExample(famulei_heross7Example example);

    int updateByExampleSelective(@Param("record") famulei_heross7 record, @Param("example") famulei_heross7Example example);

    int updateByExample(@Param("record") famulei_heross7 record, @Param("example") famulei_heross7Example example);
}