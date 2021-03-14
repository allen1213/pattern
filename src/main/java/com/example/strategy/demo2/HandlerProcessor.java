package com.example.strategy.demo2;

import com.example.strategy.demo.OrderHandlerType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HandlerProcessor implements BeanFactoryPostProcessor, ApplicationContextAware {

    ApplicationContext applicationContext;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        /*Map handlerMap = new HashMap<>(3);

        new DefaultCl*/
        Map<String, Object> map = applicationContext.getBeansWithAnnotation(OrderHandlerType.class);

        System.out.println(map);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
