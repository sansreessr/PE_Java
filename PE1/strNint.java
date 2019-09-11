import java.util.Scanner;

public class strNint{
    public static void main(String[] args){
        int num,len;
        String str;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = in.next();
        len = str.length();
        System.out.print("Enter a number: ");
        num = in.nextInt();
        int index = len-(num);
        char[] sub = new char[num];
        for(int i=0;i<num;i++)
        {
            sub[i] = str.charAt(index);
            index++;
        }
        String string = new String(sub);
        System.out.print(str);
        while(num>0)
		{
            System.out.print(string);
            num--;
        }
    }
}