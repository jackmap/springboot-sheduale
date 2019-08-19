package com.example.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-HH-dd HH:mm:ss");

    @Scheduled(fixedDelay = 20000)//两秒执行一次
    public void test() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("定时任务1  当前时间： "+sdf.format(new Date()));
    }


    @Scheduled(fixedDelay = 20000)//两秒执行一次
    public void test2() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("定时任务2  当前时间： "+sdf.format(new Date()));
    }

    @Scheduled(fixedDelay = 20000)//两秒执行一次
    public void test3() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("定时任务3 当前时间： "+sdf.format(new Date()));
    }
}
