package com.pachong.dao;

import com.pachong.entity.zhihuTeacher;
import com.pachong.entity.zhihuTeacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface zhihuTeacherMapper {
    int countByExample(zhihuTeacherExample example);

    int deleteByExample(zhihuTeacherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(zhihuTeacher record);

    int insertSelective(zhihuTeacher record);

    List<zhihuTeacher> selectByExample(zhihuTeacherExample example);

    zhihuTeacher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") zhihuTeacher record, @Param("example") zhihuTeacherExample example);

    int updateByExample(@Param("record") zhihuTeacher record, @Param("example") zhihuTeacherExample example);

    int updateByPrimaryKeySelective(zhihuTeacher record);

    int updateByPrimaryKey(zhihuTeacher record);
}