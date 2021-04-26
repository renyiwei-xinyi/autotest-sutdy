package com.evie.example.xUnit0410;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

public class TestLife {

    @BeforeAll
    static void before_all(TestInfo testInfo){

        System.out.println("before all " + testInfo);
    }

    @BeforeEach
    void before_each(TestInfo testInfo){
        System.out.println("before each " + testInfo);
    }

    @Test
    void test_12381(TestInfo testInfo){
        System.out.println("test 12381 " + testInfo);
    }


    @ParameterizedTest
    @NullSource
    void test_172389(String s, TestInfo testInfo){
        System.out.println("test 172389 " + testInfo);
    }

    @RepeatedTest(3)
    void test_17398(RepetitionInfo repetitionInfo, TestInfo testInfo){
        System.out.println("test 17398 " + testInfo);

        System.out.println("test 17398 " + repetitionInfo);

    }




    @AfterEach
    void after_each(TestInfo testInfo){
        System.out.println("after each " + testInfo);
    }

    @AfterAll
    static void after_all(TestReporter testReporter, TestInfo testInfo){
        System.out.println("after all " + testInfo);
        testReporter.publishEntry("nihao");
        System.out.println("after all " + testReporter);

    }

}
