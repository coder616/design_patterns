package com.github.lj128.design.patterns.singleton;

import java.util.Objects;

/**
 * Created by liujia on  14:57
 * <p>
 * 单例模式
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton singleton;

    /**
     * double check
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        if (Objects.isNull(singleton)) {
            synchronized (DoubleCheckSingleton.class) {
                if (Objects.isNull(singleton)) {
                    singleton = new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
