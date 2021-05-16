package com.javaEE.fremwork.Spring.unit01;

import com.javaEE.fremwork.Spring.bean.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring框架的应用之复习
 */
public class Spring01 {

    // 创建Spring容器的三种方式(一、ApplicationContext, 二、BeanFactory)

    // 一、ApplicationContext
    // 1. applicationContext之从文件系统中加载配置文件创建.
    private static String appConfigPath01 = "D:\\Devlopment\\IDE_Project\\JavaKnowledge\\src\\main\\resources\\applicationContext.xml";
    private static ApplicationContext ac01 = new FileSystemXmlApplicationContext(appConfigPath01);

    // 2. applicationContext之从classpath下加载配置文件创建.
    private static String appConfigPath02 = "applicationContext.xml";
    private static ApplicationContext ac02 = new ClassPathXmlApplicationContext(appConfigPath02);

    // 二、BeanFactory
    // 1.BeanFactory从文件系统获取配置文件初始化Spring容器
    private static BeanFactory bf01 = null;
    // 2.BeanFactory从classpath中获取配置文件初始化Spring容器


    public static void main(String[] args) {
        User user01 = (User)ac01.getBean("user01");
        User user02 = (User)ac01.getBean("user01");
        System.out.println(user01.toString());
        // Spring容器中Bean默认是单例的,所以这里user01与user02地址值是相等的.
        System.out.println(user02 == user01);
        User user03 = (User)ac02.getBean("user02");
        User user04 = (User)ac02.getBean("user02");
        System.out.println(user03.toString());
        // 由于在配置文件中对Bean id为user02的Bean 设置了scope="prototype"所以这里的两个对象的地址值是不同的.
        System.out.println(user03 == user04);
    }

}
