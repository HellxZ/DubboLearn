package com.cnblogs.hellxz;

import com.cnblogs.hellxz.service.IProviderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 消费者启动类
 */
public class ConsumerMain {

    @Test
    public void testFullXmlConfig() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("consumer-full-xml-config.xml");
        //由于上边的xml中没有扫描注解，不会走service.impl包下的实现，按照xml下id做为bean的键
        IProviderService providerService = (IProviderService) ctx.getBean("providerService");
        System.err.println(providerService.call());
    }

    @Test
    public void testAnnotationConfig() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer-annotation-config.xml");
        //注解方式无法找到指定的bean,这里对应到一个实体中完成业务，这里先埋个点，会在下个分支用springBoot重写一遍
        IProviderService providerService = (IProviderService) context.getBean("providerService");
        System.err.println(providerService.call());
    }

}
