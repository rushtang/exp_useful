package com.tmh.handler;

import com.tmh.domian.Msg;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author tangmaoheng
 * @createTime 2020年12月02日 15:15:00
 */

@Component
@Order(2)
public class SiChuanDataHandler implements DataHandler<String> {


    @Override
    public boolean support(Msg msg) {

        if (msg.getType().equals("sichuan")) {
            return true;
        }

        return false;
    }


    @Override
    public String handler(Msg msg) {

       switch (msg.getOperate()){
           case "add":
               return "sichuan进行了add操作";
           case "del":
               return "sichuan进行了del操作";
           case "update":
               return "sichuan进行了update操作";
       }

        return "不支持的操作";
    }
}
