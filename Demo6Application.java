package com.example.demo;

import org.javatuples.Pair;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo6Application {

  public static void main(String[] args) {
    SpringApplication.run(Demo6Application.class, args);
//    boolean value1 = true;
//    boolean value2=false;
    BooleanTest booleanTest=new BooleanTest();
//    System.out.println(booleanTest.oneWayBoolean(value1, value2));
//    System.out.println(booleanTest.oneWayBoolean(value2, value1));
//    System.out.println(booleanTest.oneWayBoolean(value1, value1));
//    System.out.println(booleanTest.oneWayBoolean(value2, value2));
    Pair<Boolean, Integer> testPair1=new Pair(Boolean.FALSE, 0);
    Pair<Boolean, Integer> testPair2=new Pair(Boolean.TRUE, 1);
    Pair<Boolean, Integer> testPair3=new Pair(Boolean.FALSE, 1);
    System.out.println(booleanTest.twoWayBoolean(testPair1, testPair2));
    System.out.println(booleanTest.twoWayBoolean(testPair2, testPair1));
    System.out.println(booleanTest.twoWayBoolean(testPair1, testPair1));
    System.out.println(booleanTest.twoWayBoolean(testPair2, testPair2));
    System.out.println(booleanTest.twoWayBoolean(testPair1, testPair3));
    System.out.println(booleanTest.twoWayBoolean(testPair2, testPair3));
  }

}
