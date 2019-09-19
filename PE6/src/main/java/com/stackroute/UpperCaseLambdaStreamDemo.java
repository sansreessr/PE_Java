package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class UpperCaseLambdaStreamDemo {

    public List<String> toUpperCase(List<String> list) {

        List<String> upper =new ArrayList<>();
        list.stream().map(String::toUpperCase)
                .forEach(p -> upper.add(p));
        return upper;
    }
}
