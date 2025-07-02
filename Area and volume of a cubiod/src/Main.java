import java.util.Scanner;
class JK{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Lenght , Width , Height of a cubiod: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int front = l*h;
        int right =  b*h;
        int Bottom = l*b;
        int total_Area =2*( front+right+Bottom);
        int volume = l*b*h;
        System.out.println("Area of a Cubiod is:" + total_Area + "          Volume of a Cubiod is: " + volume);
    }
}