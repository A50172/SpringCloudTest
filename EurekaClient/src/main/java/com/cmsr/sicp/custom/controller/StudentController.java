package com.cmsr.sicp.custom.controller;

import com.cmsr.sicp.custom.bean.Student;
import com.cmsr.sicp.custom.service.ScoreService;
import com.cmsr.sicp.custom.service.StudentService;
import com.cmsr.sicp.custom.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * created by 巩尊豪 2020/7/21
 */
@RestController
@RequestMapping("Student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/selectAll")
    public List<StudentVo>  selectAll(){
        return studentService.selectAll();
    }
    @PostMapping("/addStudent")
    public int addStudent(Student student){
            int i = studentService.addStudent(student);

            if(i==1){
                return 1;
            }else{
                return 0;
            }
    }
}
