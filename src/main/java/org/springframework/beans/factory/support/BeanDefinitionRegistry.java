package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanDefinition;

/**
 * BeanDefinition注册表接口
 *
 * BeanDefinitionRegistry，BeanDefinition注册表接口，定义注册BeanDefinition的方法。
 */
public interface BeanDefinitionRegistry {
    /**
     * 向注册表中注BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
