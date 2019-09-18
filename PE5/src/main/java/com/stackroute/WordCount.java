package com.stackroute;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class WordCount {

    public Map<String, Integer> wordFreq(String str) {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                word += str.charAt(i);
            }
            else {
                if (word != "") {
                    Integer count = map.get(word);
                    if (count == null) {
                        map.put(word, 1);
                    } else {
                        map.put(word, count + 1);
                    }
                    word = "";
                }
            }
            if (i == (str.length() - 1)) {
                if (word != "") {
                    Integer count = map.get(word);
                    if (count == null) {
                        map.put(word, 1);
                    } else {
                        map.put(word, count + 1);
                    }
                    word = "";
                }
            }
        }
        return map;
    }
}
