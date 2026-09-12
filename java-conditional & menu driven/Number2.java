import java.util.Scanner;
public class Number2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in); 
        System.out.print("Enter number to check:");
        int x=sc.nextInt();
        if(x%2==0)
        {
            System.out.print("Even number.");
        }    
        else
        {
            System.out.print("Odd number.");
        }
    }
}