import java.util.Scanner;
import java.util.Arrays; 

public class numManip{
    public static void main(String[] args){
        int num,snum;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        sort(num);
    }
    public static void sort(int n){
        int[] arr = new int[10];
        int i=0,num=0,sum=0;
        while(n!=0){
            arr[i]=n%10;
            n/=10;
            i++;
        }
        Arrays.sort(arr);
        for(int j=9;j>=(10-i);j--)
        {
            num=(num)*10+arr[j];
            if(arr[j]%2==0)
                sum+=arr[j];
        }
        System.out.println("Sorted number in non increasing order: " +num);
        System.out.println("Sum of even numbers: " +sum);
        if(sum>15)
            System.out.println("True");
        else
            System.out.println("False");
    }
}