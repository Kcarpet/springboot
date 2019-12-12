package com.codingsbird.executor.impl;

import com.alibaba.fastjson.JSON;
import com.codingsbird.executor.TestTaskInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Classname TestTaskInterfaceImpl
 * @Description 测试线程池实现类
 * @Author jiabof@yonyou.com
 * @Date 2019/12/12 14:37
 */
@Service
public class TestTaskInterfaceImpl implements TestTaskInterface {
    private static final Logger LOG = LoggerFactory.getLogger(TestTaskInterfaceImpl.class);
    @Override
    @Async("testTaskThread")
    public void asyncWork(Map<String, String> param) {
        LOG.info(Thread.currentThread().getName()+":"+JSON.toJSONString(param));
    }
}
