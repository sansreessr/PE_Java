package com.stackroute;

public class PowFour {

    public boolean pofFour(int num) {
        int n = 4;
        boolean bool = false;
        if ( n==num )
            bool = true;
        while(n<num) {
            n *= 4;
            if( n==num )
                bool = true;
            else if ( n>num)
                bool = false;
        }
        return bool;
    }

}
