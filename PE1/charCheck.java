import java.util.Scanner;

public class charCheck{
    public static void main(String[] args)
    {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = in.next().charAt(0);
        int ascii = ch;
        if(ascii>=65 && ascii<=90)
            System.out.println("The character entered is a capital letter");
        else if(ascii>=97 && ascii<=122)
            System.out.println("The character entered is a small letter");
        else if(ascii>=48 && ascii<=57)
            System.out.println("The character entered is a digit");
        else
            System.out.println("The character entered is a special symbol");
    }
}