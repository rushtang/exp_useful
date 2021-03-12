package com.tmh.config;

import lombok.Data;

/**
 * @author tangmaoheng
 * @createTime 2020年11月30日 10:46:00
 */

@Data
public class Tool {

    private String name;
    private String text;

    public Tool(String name,String text) {
        setName(name);
        setText(text);
    }

    public String getContent(){

        return getName()+getText();
    }


}
