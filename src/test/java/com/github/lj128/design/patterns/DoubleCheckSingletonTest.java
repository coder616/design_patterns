package com.github.lj128.design.patterns;

import com.github.lj128.design.patterns.singleton.DoubleCheckSingleton;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.junit.Test;

/**
 * Created by liujia on  15:08
 */
public class DoubleCheckSingletonTest {

  @Test
  public void test() throws Exception {
    ExecutorService threadPool = Executors.newFixedThreadPool(5);
    List<Future> futures = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      Future<?> future = threadPool.submit(() -> {
        for (int j = 0; j < 100; j++) {
          System.out.println(
              Thread.currentThread().getId() + " " + DoubleCheckSingleton.getInstance().toString());
        }
      });
      futures.add(future);
    }
    for (Future future : futures) {
      future.get();
    }
  }
}
