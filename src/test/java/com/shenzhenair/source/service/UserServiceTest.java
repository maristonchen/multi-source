package com.shenzhenair.source.service;

import com.shenzhenair.source.bean.master.User;
import com.shenzhenair.source.bean.slaver.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * (用一句话描述该文件做什么)
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/7
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-global.xml"})
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Resource
    private StudentService studentService;

    @Test
    public void save() throws Exception {

        User user = new User();
        user.setUserNo("U329834893489348949");
        user.setName("说的就是");
        userService.save(user);
    }

    @Test
    public void queryById() throws Exception {

        Student student = new Student();
        student.setName("滴滴DD滴");
        student.setStudentNo("S4838438483444");
        studentService.save(student);

        User user = userService.queryById("U329834893489348949");

        System.out.println(user);
    }

}