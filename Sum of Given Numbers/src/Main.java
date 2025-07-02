import java.util.Scanner;
class ReadNInputs {
    public static void main(String[]args){
        System.out.print("Enter a Integer: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=N;i++){
            System.out.print("Enter a Number " + (i) + ": ");
            int number = sc.nextInt();
            sum+=number;
        }
        System.out.print("Sum is : " + sum);
    }
}