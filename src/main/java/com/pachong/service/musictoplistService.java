package com.pachong.service;

import com.pachong.dao.musictoplistMapper;
import com.pachong.entity.musictoplist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class musictoplistService {
    @Autowired
    musictoplistMapper musictoplistMapper;

    public void saveMsg(musictoplist musictoplist) {
        musictoplistMapper.insertSelective(musictoplist);
    }
}
