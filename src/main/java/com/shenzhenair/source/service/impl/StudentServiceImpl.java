package com.shenzhenair.source.service.impl;

import com.shenzhenair.source.bean.slaver.Student;
import com.shenzhenair.source.mapper.slaver.StudentMapper;
import com.shenzhenair.source.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * (用一句话描述该文件做什么)
 *
 * @author mariston
 * @version V1.0
 * @since 2016/11/7
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;

    @Override
    @Transactional(transactionManager = "transactionManagerSlaver")
    public void save(Student student) {

        studentMapper.insert(student);
    }

    @Override
    public Student queryById(String id) {
        return studentMapper.selectOneById(id);
    }

}
