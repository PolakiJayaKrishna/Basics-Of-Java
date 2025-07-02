import java.lang.*;
import java.util.*;
class JK {
    public static void main(String[]args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A,B,C values: ");
        a=sc.nextInt();
        b=sc.nextInt();
        c= sc.nextInt();
        double r1 = (-b-Math.sqrt(b * b - (4 * a * c)))/(2 * a);
        double r2 = (-b+Math.sqrt(b * b - ( 4 * a * c)))/(2 * a);
        System.out.println("Root R1 is: " + r1);
        System.out.print("Root R2 is: " + r2);
    }
}








/*
class Jk{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of a Triangle A: ");
        int A = sc.nextInt();
        System.out.print("Enter side of a Triangle B: ");
        int B = sc.nextInt();
        System.out.print("Enter side of a Triangle C: ");
        int C = sc.nextInt();
        float S = (A*B*C)/2f;
        double Area = Math.sqrt(S*(S*A)*(S*B)*(S*C));
        System.out.println(Area);
    }
}*/





/*import java.util.Scanner;
class JK {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base value of the Triangle: ");
        int base = sc.nextInt();
        System.out.print("Enter the Height value of the Triangle: ");
        int height = sc.nextInt();
        float Area = (base*height)/2;
        System.out.print(Area);
    }
}*/