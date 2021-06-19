package com.github.lj128.design.patterns.abstractfactory;

/** Created by liujia on 15:58 */
public abstract class AbstractWhiteHuman implements Human {

  @Override
  public void getColor() {
    System.out.println("white");
  }

  @Override
  public void talk() {
    System.out.println("english");
  }
}
