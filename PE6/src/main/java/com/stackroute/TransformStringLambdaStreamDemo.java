package com.stackroute;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class TransformStringLambdaStreamDemo {

    public String getString(List<Integer> list) {

        AtomicReference<String> str = new AtomicReference<>("");
        list.stream()
                .forEach(i -> {
                    if( i%2 == 0)
                        str.set(str + "e" + Integer.toString(i) + ",");
                    else
                        str.set(str + "o" + Integer.toString(i) + ",");
                });
        return str.get();
    }
}
