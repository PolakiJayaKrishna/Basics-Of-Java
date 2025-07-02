import java.util.Scanner;
class JK {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int Num= sc.nextInt();
        sc.close();
        int sum =0;
        if(Num<0)
            Num = -Num;
        int temp = Num;
        while(temp !=0){
            sum+= temp%10;
            temp /=10;
        }
        System.out.print(sum);
    }
}