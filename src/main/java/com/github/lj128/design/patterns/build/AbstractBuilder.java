package com.github.lj128.design.patterns.build;

/** Created by liujia on 16:48 */
public abstract class AbstractBuilder {
  // 设置产品的不同部分
  public abstract void setPart();
  // 建造产品
  public abstract Product buildProduct();
}
