package com.example.demo;

import org.javatuples.Pair;
import org.javatuples.Tuple;

public class BooleanTest {

  public boolean oneWayBoolean(boolean value1, boolean value2){
    return value1 || value2;
  }

  public Pair twoWayBoolean(Pair<Boolean, Integer> pair1, Pair<Boolean, Integer> pair2){
    Integer value1=pair1.getValue1();
    Integer value2=pair2.getValue1();
    if(value1 > value2){
      return new Pair(pair1.getValue0(), value1);
    } else {
      return new Pair(pair2.getValue0(), value2);
    }
  }

}
