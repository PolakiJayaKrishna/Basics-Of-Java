import java.util.Scanner;
class Jk{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Divisor :");
        int T = sc.nextInt();
        System.out.print("Enter a Number for M: ");
        int M = sc.nextInt();
        System.out.print("Enter a Number for N: ");
        int N = sc.nextInt();
        int sum =0;
        for(int i =M;i<=N;i++){
            if(i%T == 0)
                sum+=i;
        }
        System.out.print(sum);
    }
}