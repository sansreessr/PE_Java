package com.stackroute;

public class HarryPresence {

    public boolean isHarryPresent(String str) {
        String[] words = str.split(" ");
        for(String st: words) {
            if(st.equals("Harry"))
                return true;
        }
        return false;
    }
}
