package com.github.lj128.design.patterns.factory;

import java.lang.reflect.Constructor;

/** Created by liujia on 15:38 */
public class ConcreteFactory extends Factory {

  @Override
  public <T extends Product> T createProduct(Class<T> clazz) {
    try {
//      Product product = (Product) Class.forName(clazz.getName()).newInstance();
      Constructor<T> constructor = clazz.getDeclaredConstructor();
      constructor.setAccessible(true);
      return (T) constructor.newInstance();
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
