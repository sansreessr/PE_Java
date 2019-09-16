package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordOcc {

    public String wordPos(String str, String seq) {

        String exp = "";
        Pattern word = Pattern.compile(seq);
        Matcher match = word.matcher(str);

        while (match.find()) {
            exp = exp +"Found at: "+ match.start() +" - "+ (match.end()) + " ";
        }
        exp = exp.trim();
        return exp;
    }
}
