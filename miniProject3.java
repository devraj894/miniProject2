import java.util.Scanner;

public class miniProject3{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the information for Rectangle");
        
        System.out.println("Enter lenght of rectangle : ");
        int l=sc.nextInt();
        System.out.println("Enter breath of rectangle : ");
        int b=sc.nextInt();

        int Area1=l*b;
        
        System.out.print("Area of Rectangle is : ");
        System.out.println(Area1);

        System.out.println("Enter the information of Square");
        
        System.out.println("Enter side of square : ");
        int side=sc.nextInt();
        
        int Area2=side*side;
        
        System.out.print("Area of Square is : ");
        System.out.println(Area2);

        System.out.println("Enter the information of Triangle");
        
        System.out.println("Enter base of triangle : ");
        int base=sc.nextInt();
        System.out.println("Enter height of triangle : ");
        int height=sc.nextInt();
        
        double Area3=(base*height)/2;
        System.out.print("Area of Triangle is : ");
        System.out.println(Area3);
    }
}
