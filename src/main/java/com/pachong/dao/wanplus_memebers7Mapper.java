package com.pachong.dao;

import com.pachong.entity.wanplus_memebers7;
import com.pachong.entity.wanplus_memebers7Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface wanplus_memebers7Mapper {
    int countByExample(wanplus_memebers7Example example);

    int deleteByExample(wanplus_memebers7Example example);

    int insert(wanplus_memebers7 record);

    int insertSelective(wanplus_memebers7 record);

    List<wanplus_memebers7> selectByExample(wanplus_memebers7Example example);

    int updateByExampleSelective(@Param("record") wanplus_memebers7 record, @Param("example") wanplus_memebers7Example example);

    int updateByExample(@Param("record") wanplus_memebers7 record, @Param("example") wanplus_memebers7Example example);
}