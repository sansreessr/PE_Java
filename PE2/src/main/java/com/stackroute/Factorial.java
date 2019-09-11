package com.stackroute;

public class Factorial {

    public int[] factorial(int[] n) {
        int fact;
        int[] arr = new int[12];
        for(int i=n[0]; i<=12; i++) {
            fact = intFactorial(i);
            arr[i-1] = fact;
        }
        return arr;
    }
    public int intFactorial(int n) {
        if(n==1)
            return 1;
        else
            return n*intFactorial(n-1);
    }
    public String longFactorial(String str) {
        long fact = 0l;
        String str1="";
        long i = 1;
        while(true){
            fact = longFact(i);

            if(fact > 0){
                str = str + fact + ",";
                i++;
            }else{
                break;
            }
        }
        return str;
    }
    public long longFact(long n) {
        if(n==1l)
            return 1l;
        else
            return n*longFact(n-1);
    }

}
