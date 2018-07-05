package com.pachong.service;

import com.pachong.dao.zhihuTeacherMapper;
import com.pachong.entity.zhihuTeacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pachong.controller.ZhihuPageProcessor;
/**
 * @wtk
 **/
@Service
public class zhihuTeacherService {
    @Autowired
    private zhihuTeacherMapper zhihuTeacherMapper;

    public void saveMsg(zhihuTeacher zhihuteacher) {
        zhihuTeacherMapper.insertSelective(zhihuteacher);
    }
}
