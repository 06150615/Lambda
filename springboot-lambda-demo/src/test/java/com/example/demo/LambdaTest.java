package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName LambdaTest
 * @Description TODO
 * @Author chenjian
 * @Date 2020/7/17 9:46
 * @Version 1.0
 **/
@SpringBootTest
public class LambdaTest {

    @Test
    void contextLoads() {
    }

    @Test
    public void lambda(){

        //传统模式下，线层的创建,匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread==="+Thread.currentThread().getId());
            }
        }).start();

        //jdk 8新特性，lambda表达式优化线层的创建
       new Thread(() -> {
           System.out.println("Thread==="+Thread.currentThread().getId());
       }).start();

    }


}
