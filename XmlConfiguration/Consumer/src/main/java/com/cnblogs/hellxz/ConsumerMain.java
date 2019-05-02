package com.cnblogs.hellxz;

import com.cnblogs.hellxz.service.IProviderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费者启动类
 */
public class ConsumerMain {
    public static void main(String[] args) {
        //初始化spring容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("consumer.xml");
        //取出容器中的bean
        IProviderService providerService = (IProviderService)ctx.getBean("providerService");
        //打印调用结果 为了演示清楚，打印红色的输出，并非错误信息
        System.err.println(providerService.call());
    }
}
