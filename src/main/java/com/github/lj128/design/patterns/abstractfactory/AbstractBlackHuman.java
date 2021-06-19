package com.github.lj128.design.patterns.abstractfactory;

/** Created by liujia on 15:58 */
public abstract class AbstractBlackHuman implements Human {

  @Override
  public void getColor() {
    System.out.println("black");
  }

  @Override
  public void talk() {
    System.out.println("xxxx");
  }
}
