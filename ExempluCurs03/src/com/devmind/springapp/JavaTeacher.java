package com.devmind.springapp;

public class JavaTeacher implements ITeacher {
    private Integer grade = 0;
    private WisdomWordsService wisdomWordsService;
    private int age;
    private String workPlace;

    public JavaTeacher(WisdomWordsService wisdomWordsService) {
        this.wisdomWordsService = wisdomWordsService;
    }

    @Override
    public String getHomework() {
        return "Create 100 classes";
    }

    @Override
    public String getWisdom() {
        return wisdomWordsService.getMessage();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getWorkPlace() {
        return workPlace;
    }
}
