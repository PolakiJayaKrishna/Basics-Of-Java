import java.util.Scanner;
class main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N =sc.nextInt();
        for(int i=0; i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}