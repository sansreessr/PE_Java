package com.stackroute;

import java.util.Map;

public class MapModify {

    public Map<String,String> modMap(Map<String,String> map) {

        String val = map.get("val1");
        if(val != null) {
            map.put("val1", " ");
            map.put("val2", val);
        }
        return map;
    }
}
