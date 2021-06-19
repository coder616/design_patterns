package com.github.lj128.design.patterns.abstractfactory;

/** Created by liujia on 15:58 */
public abstract class AbstractYellowHuman implements Human {

  @Override
  public void getColor() {
    System.out.println("yellow");
  }

  @Override
  public void talk() {
    System.out.println("chinese");
  }
}
