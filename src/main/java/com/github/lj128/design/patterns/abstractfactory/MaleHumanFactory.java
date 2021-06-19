package com.github.lj128.design.patterns.abstractfactory;

/** Created by liujia on 16:09 */
public class MaleHumanFactory implements HumanFactory {

  @Override
  public Human createWhiteHuman() {
    return null;
  }

  @Override
  public Human createBlackHuman() {
    return null;
  }

  @Override
  public Human createYellowHuman() {
    return new MaleYellowHuman();
  }
}
