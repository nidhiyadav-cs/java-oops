import java.util.*;
class Ex1
{
    private int r;
    public void getRadius(int a)
    {
        r = a;
    }
    public void areaCircle()
    {
        float area=3.14f*r*r;
        System.out.println("Area of Circle is: "+area);         
    }
    public void circumCircle()
    {
        float circum=2*3.14f*r;
        System.out.println("Circumference of Circle is: "+circum);
    }
}
public class Circle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of Circle: ");
        int r = sc.nextInt();
        Ex1 obj = new Ex1();
        obj.getRadius(r);
        obj.areaCircle();
        obj.circumCircle();
    }
}