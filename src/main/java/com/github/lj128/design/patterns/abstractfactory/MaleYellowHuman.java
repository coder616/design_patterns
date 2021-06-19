package com.github.lj128.design.patterns.abstractfactory;

/** Created by liujia on 16:06 */
public class MaleYellowHuman extends AbstractYellowHuman {

  @Override
  public void getSex() {
    System.out.println("yellow male");
  }
}
