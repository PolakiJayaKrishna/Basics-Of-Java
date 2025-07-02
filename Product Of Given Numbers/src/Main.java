import java.util.Scanner;
class productOfGivenNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Inputs: ");
        int N = sc.nextInt();
        int Product = (N == 0) ? 0 : 1;
        for(int i=1;i<=N;i++){
            System.out.print("Enter Number " + i + ": ");
            int Number =sc.nextInt();
            Product *= Number;
        }
        System.out.print("Product of the given number : " + Product);
    }
}