package com.pachong.service;

import com.pachong.dao.wanplus_memberMapper;
import com.pachong.dao.wanplus_member_summer2017Mapper;
import com.pachong.dao.wanplus_memebers7Mapper;
import com.pachong.entity.wanplus_member;
import com.pachong.entity.wanplus_member_summer2017;
import com.pachong.entity.wanplus_memebers7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class wanplus_memberService {
    @Autowired
    private wanplus_memberMapper wanplus_memberMapper;
    @Autowired
    private wanplus_memebers7Mapper wanplus_memebers7Mapper;
    @Autowired
    private wanplus_member_summer2017Mapper wanplus_member_summer2017Mapper;

    public void saveMsg(wanplus_member wanplusMember) {
        wanplus_memberMapper.insertSelective(wanplusMember);
    }

    public void saveMsg_S7(wanplus_memebers7 wanplus_members7) {
        wanplus_memebers7Mapper.insertSelective(wanplus_members7);
    }

    public void saveMsg_Summer2017(wanplus_member_summer2017 wanplus_member_summer2017) {
        wanplus_member_summer2017Mapper.insertSelective(wanplus_member_summer2017);
    }
}
