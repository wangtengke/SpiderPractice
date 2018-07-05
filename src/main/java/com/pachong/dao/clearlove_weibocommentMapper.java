package com.pachong.dao;

import com.pachong.entity.clearlove_weibocomment;
import com.pachong.entity.clearlove_weibocommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface clearlove_weibocommentMapper {
    int countByExample(clearlove_weibocommentExample example);

    int deleteByExample(clearlove_weibocommentExample example);

    int insert(clearlove_weibocomment record);

    int insertSelective(clearlove_weibocomment record);

    List<clearlove_weibocomment> selectByExample(clearlove_weibocommentExample example);

    int updateByExampleSelective(@Param("record") clearlove_weibocomment record, @Param("example") clearlove_weibocommentExample example);

    int updateByExample(@Param("record") clearlove_weibocomment record, @Param("example") clearlove_weibocommentExample example);
}