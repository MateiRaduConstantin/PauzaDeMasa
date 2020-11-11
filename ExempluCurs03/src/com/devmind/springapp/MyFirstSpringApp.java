package com.devmind.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyFirstSpringApp
{

    public static void main(String args[]) {
        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        JavaTeacher theTeacher = context.getBean("myTeacher", JavaTeacher.class);

        // call methods on the bean
        System.out.println("Wisdom: " + theTeacher.getWisdom());
        System.out.println("Age: " + theTeacher.getAge());
        System.out.println("Work place: " + theTeacher.getWorkPlace());

        // close the context
        context.close();
    }
}