package org.springframework.beans.factory.config;
/**
 * 单例注册表
 *
 * SingletonBeanRegistry及其实现类DefaultSingletonBeanRegistry，定义添加和获取单例bean的方法。
 */

public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);
}
