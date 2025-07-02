import java.util.Scanner;
class Factorial {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int temp , Product = 1;
        System.out.print("Enter a Number: ");
        int Num = sc.nextInt();
        if(Num<0)
            Num = -Num;
        temp = Num;
        while(temp !=0){
            Product *= temp%10;
            temp /=10;
        }
        System.out.print(Product);
    }
}