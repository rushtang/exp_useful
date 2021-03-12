package com.tmh.handler;

import com.tmh.domian.Msg;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author tangmaoheng
 * @createTime 2020年12月02日 15:15:00
 */

@Component
@Order(1)
public class ShiYanDataHandler implements DataHandler<String> {


    @Override
    public boolean support(Msg msg) {

        if (msg.getType().equals("shiyan")) {
            return true;
        }

        return false;
    }


    @Override
    public String handler(Msg msg) {

       switch (msg.getOperate()){
           case "add":
               return String.format("shiyan进行了add操作:%s",msg.getParamData().toString() );
           case "del":
               return  String.format("shiyan进行了del操作:%s",msg.getParamData().toString() );
           case "update":
               return String.format("shiyan进行了update操作:%s",msg.getParamData().toString() );
       }

        return "不支持的操作";
    }
}
