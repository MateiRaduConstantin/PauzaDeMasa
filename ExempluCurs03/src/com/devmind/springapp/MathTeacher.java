package com.devmind.springapp;

public class MathTeacher implements ITeacher{
    private Integer grade;
    private WisdomWordsService wisdomService;
    private static final String MATH_TEACHER_PREFIX = "Math teacher says: ";

    public void setWisdomService(WisdomWordsService wisdomService) {
        this.wisdomService = wisdomService;
    }

    public String getWisdom() {
        return MATH_TEACHER_PREFIX + wisdomService.getMessage();
    }

    @Override
    public String getHomework() {
        return "Solve 100 calculus problems";
    }


    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}
