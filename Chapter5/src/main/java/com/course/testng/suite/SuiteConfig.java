package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("aftersuite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforetest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("aftertest");
    }
}
