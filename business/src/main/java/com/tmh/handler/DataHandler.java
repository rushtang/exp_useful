package com.tmh.handler;

import com.tmh.domian.Msg;

/**
 * @author tangmaoheng
 * @createTime 2020年12月02日 15:05:00
 */

public interface DataHandler<T> {

    boolean support(Msg msg);

    T handler(Msg msg);


}
