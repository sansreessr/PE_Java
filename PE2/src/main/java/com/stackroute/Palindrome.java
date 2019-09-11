package com.stackroute;

public class Palindrome {

    public boolean revPalindrome(String str){

        str = str.toLowerCase();
        String rev = "";
        for(int i=0,j=str.length()-1; i< str.length(); i++){
            rev += str.charAt(j--);
        }
        if(str.equals(rev))
            return true;
        else
            return false;
    }

}
