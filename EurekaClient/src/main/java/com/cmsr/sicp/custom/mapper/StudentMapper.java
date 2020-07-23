package com.cmsr.sicp.custom.mapper;

import com.cmsr.sicp.custom.bean.Student;
import com.cmsr.sicp.custom.vo.StudentVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<StudentVo> selectAll();
}