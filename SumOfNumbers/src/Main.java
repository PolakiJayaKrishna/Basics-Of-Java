
import java.util.Scanner;
class SumOfNumbers{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int N = sc.nextInt();
        int Sum=0;
        for(int i=1;i<=N;i++){
            Sum+=i;
        }
        System.out.print("Sum of "+ N + " Natural numbers is: " + Sum);
    }
}