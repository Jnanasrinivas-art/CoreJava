package programs;

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args)
    {
        System.out.println("Enter number");
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        checkArmStrong(n);
    }
    public static void checkArmStrong(int c)
    {
        int re=0;
        int sum=0;
        while(c>0)
        {
            re=c%10;
            sum=sum+re*re*re;
            c=c/10;
        }
    }


}
