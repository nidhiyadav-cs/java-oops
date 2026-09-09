import java.util.Scanner;

class Add
{
    private int x, y; // instance variables

    public void getData(int a, int b) // method with parameters
    {
        x = a;
        y = b;
    }

    public void add() // method without parameters
    {
        int sum = x + y;
        System.out.println("Addition is: " + sum);
    }
}

public class Addition
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int i = sc.nextInt();

        System.out.print("Enter the second number: ");
        int j = sc.nextInt();

        Add obj = new Add(); // object of Add class

        obj.getData(i, j);
        obj.add();
    }
}
   
