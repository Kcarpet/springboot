package com.codingsbird;

import com.codingsbird.executor.TestTaskInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname ExecutorTest
 * @Description 测试类
 * @Author jiabof@yonyou.com
 * @Date 2019/12/12 14:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ExecutorApplication.class})// 指定启动类
public class ExecutorTest {
    @Autowired
    TestTaskInterface testTaskInterface;
    @Test
    public void testExecutor(){
        for (int i=0;i<100;i++) {
            Map<String,String> param=new HashMap<>();
            param.put("currentTime",System.currentTimeMillis()+"");
            param.put("loopCount",i+"");
            testTaskInterface.asyncWork(param);
        }
    }
}
