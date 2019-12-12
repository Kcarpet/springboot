package com.codingsbird.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Classname TaskPoolConfig
 * @Description 线程池配置类
 * @Author jiabof@yonyou.com
 * @Date 2019/11/9 10:34
 */
@Configuration
@EnableAsync
public class TaskPoolConfig {


    @Bean("testTaskThread")
    public Executor monitorExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //最小核心线程数
        taskExecutor.setCorePoolSize(5);
        //最大线程数
        taskExecutor.setMaxPoolSize(8);
        //等待时常
        taskExecutor.setKeepAliveSeconds(60);
        //队列长队
        taskExecutor.setQueueCapacity(20000);
        taskExecutor.setThreadNamePrefix("testTaskThread--");
        //当调度器shutdown被调用时等待当前被调度的任务完成
        taskExecutor.setWaitForTasksToCompleteOnShutdown(true);
        //拒绝策略
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        taskExecutor.setAwaitTerminationSeconds(60);
        return taskExecutor;
    }

}
