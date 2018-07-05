package com.pachong.dao;

import com.pachong.entity.zhihuTeacher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * @wtk
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext.xml")
public class zhihuTeacherMapperTest {
    private ApplicationContext applicationContext;
    @Autowired
    private zhihuTeacherMapper zhihuTeacherMapper;
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");//加载spring配置文件
        zhihuTeacherMapper= applicationContext.getBean(zhihuTeacherMapper.class);//在这里导入要测试的
    }
    @Test
    public void insertSelective() throws Exception {
        zhihuTeacher user = new zhihuTeacher();
////        //user.setId(3);
        user.setName("王腾科");
////        //user.setSex("男");
        int result = zhihuTeacherMapper.insertSelective(user);
        System.out.println(result);
        assert (result == 1);
        System.out.println(zhihuTeacherMapper);
    }

}