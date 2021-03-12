package com.tmh.domian;

import lombok.Data;

/**
 * @author tangmaoheng
 * @createTime 2020年12月02日 15:08:00
 */

@Data
public class Msg {
    private String type;

    private String operate;

    private Object paramData;

    private Object sourceParamData;
}
