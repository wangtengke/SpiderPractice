package com.pachong.dao;

import com.pachong.entity.wanplus_member_summer2017;
import com.pachong.entity.wanplus_member_summer2017Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface wanplus_member_summer2017Mapper {
    int countByExample(wanplus_member_summer2017Example example);

    int deleteByExample(wanplus_member_summer2017Example example);

    int insert(wanplus_member_summer2017 record);

    int insertSelective(wanplus_member_summer2017 record);

    List<wanplus_member_summer2017> selectByExample(wanplus_member_summer2017Example example);

    int updateByExampleSelective(@Param("record") wanplus_member_summer2017 record, @Param("example") wanplus_member_summer2017Example example);

    int updateByExample(@Param("record") wanplus_member_summer2017 record, @Param("example") wanplus_member_summer2017Example example);
}