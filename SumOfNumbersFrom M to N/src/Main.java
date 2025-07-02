import java.util.Scanner;
class SumOfNumbersFromMtoN {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of M: ");
        int M = sc.nextInt();
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=M;i<=N;i++){
           sum+=i;
        }
        System.out.print(sum);
    }
}