package com.cmsr.sicp.custom.vo;

import java.io.Serializable;

/**
 * created by 巩尊豪 2020/7/21
 */
public class StudentVo implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private String course;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public StudentVo(Integer id, String name, Integer age, String course, Integer score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.score = score;
    }

    public StudentVo(Integer id) {
        this.id = id;
    }
}
