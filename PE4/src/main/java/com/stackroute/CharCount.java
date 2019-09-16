package com.stackroute;

public class CharCount {

    public int countChar(String str, char ch) {
        int len1 = str.length();
        int len2 = str.replaceAll(String.valueOf(ch),"").length();
        return (len1-len2);
    }
}
