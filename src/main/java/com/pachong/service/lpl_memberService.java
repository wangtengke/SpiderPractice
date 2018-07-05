package com.pachong.service;

import com.pachong.dao.lpl_memberMapper;
import com.pachong.dao.lpl_teamMapper;
import com.pachong.entity.lpl_member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class lpl_memberService {
    @Autowired
    private lpl_memberMapper lpl_memberMapper;

    public void saveMsg(lpl_member lpl_member) {
        lpl_memberMapper.insertSelective(lpl_member);
    }
}
