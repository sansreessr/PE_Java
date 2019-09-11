import java.util.Scanner;

public class addn{
    public static void main(String[] args){
        String nums;
        int sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        nums = in.nextLine();
        String[] arrofstr = (nums.split(" ", -1));
        int len = arrofstr.length;
        int[] arrofnum = new int[len];
        for(int i=0;i<len;i++)
        {
            arrofnum[i]=Integer.parseInt(arrofstr[i]);
            sum+=arrofnum[i];
        }
        System.out.println(sum);
    }
}