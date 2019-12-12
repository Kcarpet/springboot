package com.codingsbird;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Classname ExecutorApplication
 * @Description 线程池启动类
 * @Author jiabof@yonyou.com
 * @Date 2019/12/12 14:22
 */
@SpringBootApplication
@EnableAsync
public class ExecutorApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExecutorApplication.class);
    }
}
