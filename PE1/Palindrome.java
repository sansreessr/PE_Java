import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        int num;
        boolean flag=false;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        if(checkPal(num)){
            if(addEven(num))
                System.out.println(num+" is palindrome and sum of even numbers is greater than 25");
            else
                System.out.println(num+" is palindrome and sum of even numbers is less than 25");
        }
        else
            System.out.println(num+" is not palindrome");

    }
    public static boolean checkPal(int num){
        int copy1,copy2=0;
        copy1 = num;
        while(num!=0){
            copy2=(copy2*10)+num%10;
            num/=10;
        }
        if(copy1 == copy2)
            return true;
        else
            return false;
    }
    public static boolean addEven(int num){
        int sum=0;
        while(num!=0){
            if((num%10)%2 == 0)
                sum+=(num%10);
            num/=10;
        }
        if(sum>25)
            return true;
        else
            return false;
    }
}