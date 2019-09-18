package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetImp {

    public List<String> modSet(Set<String> name) {

        Set<String> sname = new TreeSet<String>();
        sname.addAll(name);
        List list = new ArrayList(sname);
        return list;
    }
}
