package com.stackroute;

import java.util.List;
import java.util.stream.Stream;

public class AverageLambdaStreamDemo {

    public Double average(List<Integer> list) {
        int sum = 0;
        Double avg;
        Stream<Integer> stream = list.stream();
        sum = stream.mapToInt(p -> p).sum();
        avg = (double) sum/(list.size());
        return avg;
    }
}
