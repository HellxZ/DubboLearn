package com.cnblogs.hellxz;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

/**
 * 服务提供者启动类
 */
public class ProviderMain {
    public static void main(String[] args) throws IOException {
        //读取配置文件，初始化Spring容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("provider.xml");
        //保持线程存活
        System.in.read();
    }
}
