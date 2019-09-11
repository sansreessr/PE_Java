import java.util.Scanner;

public class loopn{
    public static void main(String[] args)
    {
        int num=0,i=1,hold=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = in.nextInt();
        while(i<=num){
            hold = i;
            while(hold>0){
                System.out.print(i);
                hold--;
            }
            i++;
        }
    }
}