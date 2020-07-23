package com.cmsr.sicp.custom.service;

import com.cmsr.sicp.custom.bean.Student;
import com.cmsr.sicp.custom.vo.StudentVo;

import java.util.List;

public interface StudentService {
    List<StudentVo>  selectAll();

    int addStudent(Student studnet);
}
