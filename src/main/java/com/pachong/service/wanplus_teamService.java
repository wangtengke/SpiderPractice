package com.pachong.service;

import com.pachong.dao.wanplus_teamMapper;
import com.pachong.entity.wanplus_team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class wanplus_teamService {
    @Autowired
    private wanplus_teamMapper wanplus_teamMapper;

    public void saveMsg(wanplus_team wanplusTeam) {
        wanplus_teamMapper.insertSelective(wanplusTeam);
    }
}
