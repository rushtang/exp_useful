//package com.tmh.bean;
//
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.beans.factory.FactoryBean;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
///**
// * @author tangmaoheng
// * @createTime 2020年11月30日 16:21:00
// */
//@Component
//@Log4j2
//public class MyBean implements FactoryBean {
//
//    @Getter
//    @Setter
//    private String name;
//    @Getter
//    @Setter
//    private String text;
//
//
//    public MyBean() {
//        setName("如是说");
//        setText("rush23333");
//    }
//
//    @Override
//    public MyBean getObject() throws Exception {
//
//        MyBean myBean = new MyBean();
//        myBean.setName(myBean.getName()+"++");
//        log.info("获取该bean之前的操作（复杂bean的实例化）");
//
//        return myBean;
//    }
//
//    @Override
//    public Class<?> getObjectType() {
//
//        return MyBean.class;
//    }
//}
