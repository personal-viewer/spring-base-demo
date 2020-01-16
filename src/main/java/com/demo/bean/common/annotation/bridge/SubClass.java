package com.demo.bean.common.annotation.bridge;

import com.demo.bean.common.base.PlainBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class SubClass implements SuperClass<String> {

    @Override
    public String method(String param) {
        return param;
    }
}