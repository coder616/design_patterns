package com.github.lj128.design.patterns.build;

/** Created by liujia on 16:51 */
public class Director {
  private AbstractBuilder builder = new ConcreteBuilder();

  public Product getProduct() {
    builder.setPart();
    return builder.buildProduct();
  }
}
