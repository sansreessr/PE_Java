package com.stackroute;

import java.util.Arrays;

public class SortWords {

    public String[] sortPara(String para) {

        String[] str = para.split(" ");
        for(int i=0; i<str.length; i++) {
            if (str[i] != null && str[i].length() > 0 && ((str[i].charAt(str[i].length() - 1) == ',') || (str[i].charAt(str[i].length() - 1) == '.'))) {
                str[i] = str[i].substring(0, str[i].length() - 1);
            }
        }
        Arrays.sort(str);
        return str;
    }

}
