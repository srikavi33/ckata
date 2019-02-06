import java.io.*;
import java.util.Scanner;
class vowelConstant
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner input=new Scanner (System.in);
        char ch=input.next().charAt(0);
        if((ch>'a'&&ch<='z')||(ch>='A'&&ch<='z'))
        {
            System.out.println("Alphabet");
        }
        else        
        {
            System.out.println("no");
        }
    }
}
