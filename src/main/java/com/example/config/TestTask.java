package com.example.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
//多任务执行的类
@Component
@Async
public class TestTask {

        // 没有返回值的异步调用
        @Async // 表明这异步方法 无返回值
        public  void task1() {
            long s = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long e = System.currentTimeMillis();
            System.out.println("tas1k总耗时:" + (e - s));
            System.out.println("执行异步任务 1 :"  + Thread.currentThread().getName());
        }

        @Async // 表明这异步方法 无返回值
        public  void task2() {
            long s = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long e = System.currentTimeMillis();
            System.out.println("tas2k总耗时:" + (e - s));
            System.out.println("执行异步任务2 : " + Thread.currentThread().getName());
        }

        @Async // 表明这异步方法 无返回值
        public  void task3() {
            long s = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long e = System.currentTimeMillis();
            System.out.println("tas3k总耗时:" + (e - s));
            System.out.println("执行异步任务3 : "  + Thread.currentThread().getName());
        }

        @Async // 表明这异步方法 无返回值
        public  void task5() {
            long s = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long e = System.currentTimeMillis();
            System.out.println("tas5k总耗时:" + (e - s));
            System.out.println("执行异步任务" + 5 + Thread.currentThread().getName());
        }

        @Async // 表明这异步方法 无返回值
        public  void task4() {
            long s = System.currentTimeMillis();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long e = System.currentTimeMillis();
            System.out.println("tas4k总耗时:" + (e - s));
            System.out.println("执行异步任务" + 4 + Thread.currentThread().getName());
        }
}
