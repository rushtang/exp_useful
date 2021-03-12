package com.tmh.service;

import com.tmh.domian.Msg;
import com.tmh.handler.DataHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author tangmaoheng
 * @createTime 2020年12月02日 15:22:00
 */

@Service
public class DataServiceImpl implements IDataService {

    //Spring会自动把所有类型为DataHandler的bean装配为一个List注入进来，根据@Order设置list的顺序
    @Autowired
    List<DataHandler> dataHandlerList;



    @Override
    public String service(Msg msg) {

        String handResult="暂无支持的type";

        for (DataHandler dataHandler : dataHandlerList) {

            if (dataHandler.support(msg)) {
                handResult =(String) dataHandler.handler(msg);
            }

        }

        return handResult;
    }



}
