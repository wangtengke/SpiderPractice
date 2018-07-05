package com.pachong.service;

import com.pachong.dao.lpl_championMapper;
import com.pachong.entity.lpl_champion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class lpl_championService {
    @Autowired
    private lpl_championMapper lpl_championMapper;
    public void saveMsg(lpl_champion lpl_champion) {
        lpl_championMapper.insertSelective(lpl_champion);
    }
}
