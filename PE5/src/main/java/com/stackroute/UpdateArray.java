package com.stackroute;

import java.util.List;

public class UpdateArray {

    public void updateElement(List<String> list, String cur, String upd) {

        for(String ls: list) {
            if(ls.equals(cur))
                list.set(list.indexOf(ls), upd);
        }
        System.out.print(list);
    }

    public void emptyArray(List<String> list) {

        list.clear();
        System.out.print(list);
    }
}
