import java.util.Scanner;

public class guessNum{
    public static void main(String[] args){
        int num,gnum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number (1-100): ");
        num = in.nextInt();
        System.out.println("Start guessing");
        gnum = in.nextInt();
        while(gnum!=num)
        {
            if(gnum>num)
            {
                System.out.println("Number guessed is more than original number");
                gnum = in.nextInt();
            }
            else
            {
                System.out.println("Number guessed is less than original number");
                gnum = in.nextInt();
            }
        }
        System.out.println("Number guessed matches the original number");
    }
}