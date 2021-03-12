//package com.tmh.usebean;
//
//import com.tmh.bean.MyBean;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.BeansException;
//import org.springframework.beans.factory.InitializingBean;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.stereotype.Component;
//
///**
// * @author tangmaoheng
// * @createTime 2020年11月30日 15:42:00
// */
//
//@Log4j2
//@Component
//public class BeanUtil implements ApplicationContextAware {
//
//    private static ApplicationContext applicationContext;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//
//    // 获取applicationContext
//    public static ApplicationContext getApplicationContext() {
//        return applicationContext;
//    }
//
//    // 通过name获取 Bean.
//    public static Object getBean(String name) {
//        return getApplicationContext().getBean(name);
//    }
//
//    // 通过class获取Bean.
//    public static <T> T getBean(Class<T> clazz) {
//        return getApplicationContext().getBean(clazz);
//    }
//
//    // 通过name,以及Clazz返回指定的Bean
//    public static <T> T getBean(String name, Class<T> clazz) {
//        return getApplicationContext().getBean(name, clazz);
//    }
//
////    @Override
////    public void afterPropertiesSet() throws Exception {
////        MyBean bean = this.applicationContext.getBean(MyBean.class);
////
////        log.info("\n MyBean:   "+bean.getName()+bean.getText());
////    }
//}
