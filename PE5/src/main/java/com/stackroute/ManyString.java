package com.stackroute;

import java.util.LinkedHashMap;
import java.util.Map;

public class ManyString {

    public Map<String , Boolean> isMany(String[] str) {
        Map<String, Boolean> map = new LinkedHashMap<>();
        for(String st: str) {
            Boolean bool = map.get(st);
            if (bool == null) {
                map.put(st, false);
            }
            else if(bool == false){
                map.put(st, true);
            }
        }
        return map;
    }
}
