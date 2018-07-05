package com.pachong.service;

import com.pachong.dao.bilibiliuser_followMapper;
import com.pachong.entity.bilibiliuser_follow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class bilibiliuser_followService {
    @Autowired
    private bilibiliuser_followMapper bilibiliuser_followMapper;

    public void saveMsg(bilibiliuser_follow bilibiliuser_follow) {
        bilibiliuser_followMapper.insertSelective(bilibiliuser_follow);
    }
}
