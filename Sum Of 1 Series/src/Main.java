import java.util.Scanner;
class JK {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Sum=0,term=0;
        for(int i =1;i<=N;i++){
            term = term * 10 + 1;
            Sum += term;
        }
        System.out.print(Sum);
    }
}