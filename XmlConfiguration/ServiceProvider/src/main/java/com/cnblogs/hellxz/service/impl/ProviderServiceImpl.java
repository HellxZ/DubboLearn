package com.cnblogs.hellxz.service.impl;

import com.cnblogs.hellxz.service.IProviderService;

public class ProviderServiceImpl implements IProviderService {
    @Override
    public String call() {
        //为了演示清楚，打印红色的输出，并非错误信息
        System.err.println("服务调用成功");
        return "Call service-provider success!";
    }
}
