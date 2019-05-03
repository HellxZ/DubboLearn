package com.cnblogs.hellxz.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cnblogs.hellxz.service.IProviderService;
import org.springframework.stereotype.Service;

/**
 * 这个类主要作用就是dubbo引用的接口与providerService这个bean名称作绑定
 * 在全xml配置方式中无需存在，如果使用mvc的方式可能看得更清楚些，全配置依赖有点麻烦这里先这样吧
 */
@Service("providerService")
public class ProviderServiceImpl implements IProviderService {

    @Reference
    private IProviderService iProviderService;

    @Override
    public String call() {
        return iProviderService.call();
    }
}
