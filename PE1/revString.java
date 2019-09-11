import java.util.Scanner;

public class revString{
    public static void main(String[] args){
        String str;
        int i=0,index=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = in.nextLine();
        int len = str.length();
        char[] ch = new char[len];
        while(i<len)
        {
            index = len-(i+1);
            ch[index] = str.charAt(i);
            i++;
        }
        String string = new String(ch);
		System.out.println(string);
    }
}