package com.suk.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl {
    public String getMessage() {
        String str = " Sonar Demo Message";
        Object obj = getObject();
        System.out.println(obj.toString());
        return str;
    }

    private Object getObject() {
        return "abc";
    }

}
