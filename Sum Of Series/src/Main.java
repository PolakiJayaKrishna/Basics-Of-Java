import java.util.Scanner;
class JK {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N=sc.nextInt();
        int Sum = 0 , Term=2;
        for(int i =1;i<=N;i++){
            Sum+=Term;
            Term = Term * 10 + 2;
        }
        System.out.print(Sum);
    }
}