package com.cnblogs.hellxz;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 服务提供者启动类
 */
public class ProviderMain {

    /**
     * 以全配置方式启动spring容器，提供服务
     */
    @Test
    public void testFullXmlConfig() {
        initSpringContextWithConfigXml("provider-full-xml-config.xml");
    }

    /**
     * 使用配置方式开启注解，启动spring容器，提供服务
     */
    @Test
    public void testAnnotation() {
        initSpringContextWithConfigXml("provider-annotation-config.xml");
    }

    /**
     * 使用配置文件启动spring容器
     *
     * @param springConfigXmlName 配置文件在classPath下的路径名称
     */
    private void initSpringContextWithConfigXml(String springConfigXmlName) {
        //读取配置文件，初始化Spring容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext(springConfigXmlName);
        try {
            //保持线程存活，输入任意字符回车停止
            System.in.read();
        } catch (IOException e) {
            //仅作演示不处理
            e.printStackTrace();
        }
    }
}
