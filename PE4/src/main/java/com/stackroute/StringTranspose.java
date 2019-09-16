package com.stackroute;

public class StringTranspose {

    public String transpose(String str) {

        String[] words = str.split(" ");
        String word;
        String exp = "";
        for(String st: words) {
            word = "";
            for(int i=st.length()-1; i>=0; i--) {
                word += st.charAt(i);
            }
            exp = exp + word + " ";
        }
        exp = exp.trim();
        return exp;
    }

}
