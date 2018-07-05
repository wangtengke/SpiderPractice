package com.pachong.service;

import com.pachong.dao.famulei_herosMapper;
import com.pachong.entity.famulei_heros;
import com.pachong.entity.famulei_heross7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @wtk
 **/
@Service
public class famulei_herosService {
    @Autowired
    private famulei_herosMapper famulei_herosMapper;

    public void saveMsg(famulei_heros famuleiHeros) {
        famulei_herosMapper.insertSelective(famuleiHeros);
    }
}
