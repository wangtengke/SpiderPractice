package com.pachong.dao;

import com.pachong.entity.wanplus_member;
import com.pachong.entity.wanplus_memberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface wanplus_memberMapper {
    int countByExample(wanplus_memberExample example);

    int deleteByExample(wanplus_memberExample example);

    int insert(wanplus_member record);

    int insertSelective(wanplus_member record);

    List<wanplus_member> selectByExample(wanplus_memberExample example);

    int updateByExampleSelective(@Param("record") wanplus_member record, @Param("example") wanplus_memberExample example);

    int updateByExample(@Param("record") wanplus_member record, @Param("example") wanplus_memberExample example);
}