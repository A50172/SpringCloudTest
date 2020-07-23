package com.cmsr.sicp.custom.service;

import com.cmsr.sicp.custom.bean.Student;
import com.cmsr.sicp.custom.mapper.StudentMapper;
import com.cmsr.sicp.custom.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by 巩尊豪 2020/7/21
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<StudentVo>  selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insert(student);
    }
}
