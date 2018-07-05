package com.pachong.service;

import com.pachong.dao.lpl_teamMapper;
import com.pachong.entity.lpl_team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class lpl_teamService {

    @Autowired
    private lpl_teamMapper lpl_teamMapper;

    public void saveMsg(lpl_team lpl_team) {
        lpl_teamMapper.insertSelective(lpl_team);
    }
}
