package com.pachong.dao;

import com.pachong.entity.lpl_member;
import com.pachong.entity.lpl_memberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface lpl_memberMapper {
    int countByExample(lpl_memberExample example);

    int deleteByExample(lpl_memberExample example);

    int deleteByPrimaryKey(Integer memberid);

    int insert(lpl_member record);

    int insertSelective(lpl_member record);

    List<lpl_member> selectByExample(lpl_memberExample example);

    lpl_member selectByPrimaryKey(Integer memberid);

    int updateByExampleSelective(@Param("record") lpl_member record, @Param("example") lpl_memberExample example);

    int updateByExample(@Param("record") lpl_member record, @Param("example") lpl_memberExample example);

    int updateByPrimaryKeySelective(lpl_member record);

    int updateByPrimaryKey(lpl_member record);
}