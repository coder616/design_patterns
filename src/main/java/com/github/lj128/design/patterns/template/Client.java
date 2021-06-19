package com.github.lj128.design.patterns.template;

/** Created by liujia on 16:31 */
public class Client {
  public static void main(String[] args) {
    ConcreteTemplateA concreteTemplateA = new ConcreteTemplateA();
    ConcreteTemplateB concreteTemplateB = new ConcreteTemplateB();
    concreteTemplateA.templateMethod();
    concreteTemplateB.templateMethod();
  }
}
