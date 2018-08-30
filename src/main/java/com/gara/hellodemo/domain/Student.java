package com.gara.hellodemo.domain;

import java.util.List;

/**
 * @description: TODO
 * @author: GaraYing
 * @create: 2018-08-30 09:31
 **/

public class Student {

    private String name;
    private String number;
    private String gender;
    private String age;
    private List<String> courses;

    public Student() {
    }

    public Student(String name, String number, String gender, String age, List<String> courses) {
        this.name = name;
        this.number = number;
        this.gender = gender;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    private static class Course{
        private String name;
        private String grade;
        private String remark;

        public Course() {
        }

        public Course(String name, String grade, String remark) {
            this.name = name;
            this.grade = grade;
            this.remark = remark;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }
    }

}
