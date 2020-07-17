package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName DemoController
 * @Description Lambda控制器入口
 * @Author chenjian
 * @Date 2020/7/17 9:32
 * @Version 1.0
 **/
@RestController
@RequestMapping
public class DemoController {

    @RequestMapping("lambda")
    @GetMapping
    public void lambda(){

        //传统模式下，线层的创建,匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thring+++++"+Thread.currentThread().getId());
            }
        }).start();
    }
}


