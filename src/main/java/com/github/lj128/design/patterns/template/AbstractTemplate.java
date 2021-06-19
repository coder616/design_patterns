package com.github.lj128.design.patterns.template;

/** Created by liujia on 16:24 */
public abstract class AbstractTemplate {

  protected void doSomething() {}

  protected void doAnything() {}

  /**
   * 钩子函数，由子类实现
   *
   * @return
   */
  protected boolean hook() {
    return false;
  }

  /** 模版方法 */
  public void templateMethod() {
    if (hook()) {
      /** 钩子函数 改变模板方法的行为 */
      System.out.println("xxxx");
    }
  }
}
