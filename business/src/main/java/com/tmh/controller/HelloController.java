package com.tmh.controller;

import cn.hutool.core.map.MapUtil;
import com.tmh.HelloService;

import com.tmh.domian.Msg;
import com.tmh.service.IDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 11:06:00
 */

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
//
//    @Autowired
//    ApplicationContext applicationContext;

    @Autowired
    private IDataService dataService;


    @RequestMapping(value = "/sayHello")
    @ResponseBody
    public String sayHello(String name){
        System.out.println(helloService.sayHello(name));
        return helloService.sayHello(name);
    }


//    @GetMapping(value = "/getMy")
//    @ResponseBody
//    public MyBean getMy(){
//        MyBean bean = applicationContext.getBean(MyBean.class);
//        return bean;
//    }


    @PostMapping(value = "/sendMsg")
    @ResponseBody
    public String sendMsg(@RequestBody Map<String, Object> params){

        String type = MapUtil.getStr(params, "type");
        String operate = MapUtil.getStr(params, "operate");

        if (StringUtils.isNotEmpty(type) && StringUtils.isNotEmpty(operate)) {
            Msg msg=new Msg();
            msg.setType(type);
            msg.setOperate(operate);
            msg.setParamData(params);

            return dataService.service(msg);

        }else {
            return "error";
        }


    }

}
