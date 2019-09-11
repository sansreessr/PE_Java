import java.util.Scanner;

public class CondCheck{
    public static void main(String[] args){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        if(num>=20 && num<=30){
            if(num%2 == 0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }
    }
}