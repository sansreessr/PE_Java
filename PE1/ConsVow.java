import java.util.Scanner;

public class ConsVow{
    public static void main(String[] args){
        String word;
        char ch;
        int len,i=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        word = in.next();
        word = word.toLowerCase();
        len = word.length();
        while(i<len){
            ch = word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                System.out.print("Vowel ");
            else
                System.out.print("Consonent ");
            i++;
        }
    }
}