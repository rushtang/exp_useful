package com.tmh.config;

import com.tmh.usebean.UseAutowired;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 14:39:00
 * spring的事件驱动主要的6个事件
 *
 */

@Component
@Slf4j
public class DemoEventProcessor implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    UseAutowired useAutowired;


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        // 只能单线程里跑
        log.info("\n onApplicationEvent ++ \n");

        Tool tool = useAutowired.get();
        log.info("\n getContent:   "+tool.getContent());


//        try {
//            Thread.sleep(2);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
