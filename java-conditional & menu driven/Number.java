import java.util.Scanner;
public class Number 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int x = scanner.nextInt();
        if (x>0)
       { 
            System.out.println("Positive number");
        } 
        else 
        {
            System.out.println("Negative number");
        }
    }
}
