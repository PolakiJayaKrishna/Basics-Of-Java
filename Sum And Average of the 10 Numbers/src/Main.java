import java.util.Scanner;
class JK{
    public static void main(String[]args){
        int sum=0, Average=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 Numbers: ");
        for(int i=1;i<=10;i++) {
            int Num = sc.nextInt();
            sum +=Num;
        }
        Average = (sum/10);
        System.out.println("Sum:" +sum);
        System.out.print("Average: " + Average);
    }
}