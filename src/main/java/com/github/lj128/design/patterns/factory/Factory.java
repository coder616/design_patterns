package com.github.lj128.design.patterns.factory;

/** Created by liujia on 15:34 */
public abstract class Factory {
  abstract <T extends Product> T createProduct(Class<T> clazz);
}
