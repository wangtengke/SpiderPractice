package com.pachong.service;

import com.pachong.dao.bilibiliuser_playMapper;
import com.pachong.entity.bilibiliuser_play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class bilibiliuser_playService {
    @Autowired
    private bilibiliuser_playMapper bilibiliuser_playMapper;
    public void saveMsg(bilibiliuser_play bilibiliuser_play) {
        bilibiliuser_playMapper.insertSelective(bilibiliuser_play);
    }
}
