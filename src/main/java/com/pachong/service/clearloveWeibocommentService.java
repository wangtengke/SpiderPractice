package com.pachong.service;

import com.pachong.dao.clearlove_weibocommentMapper;
import com.pachong.entity.clearlove_weibocomment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class clearloveWeibocommentService {
    @Autowired
    clearlove_weibocommentMapper clearlove_weibocommentMapper;
    public void saveMsg(clearlove_weibocomment clearloveWeibocomment) {
        clearlove_weibocommentMapper.insertSelective(clearloveWeibocomment);
    }
}
