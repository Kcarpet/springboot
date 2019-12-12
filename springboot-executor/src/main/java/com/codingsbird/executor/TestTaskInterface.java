package com.codingsbird.executor;

import java.util.Map;

/**
 * @Classname TestTaskInterface
 * @Description 异步线程池测试接口
 * @Author jiabof@yonyou.com
 * @Date 2019/12/12 14:35
 */
public interface TestTaskInterface {

    void asyncWork(Map<String,String> param);

}
