package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class FilterStringLambdaStreamDemo {

    public List<String> search(List<String> list) {

        List<String> converted = new ArrayList<>();
        list.stream().filter((s) -> (s.startsWith("A")) && (s.length() == 3))
                .forEach(p -> converted.add(p));
        return converted;
     }
}
