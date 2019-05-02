package com.cnblogs.hellxz.service;

/**
 * 与服务提供者完全一致的接口，包路径、类名、方法名均需要与服务提供者保持一致
 * 否则会出现调用不到方法的错误
 */
public interface IProviderService {
    String call();
}
