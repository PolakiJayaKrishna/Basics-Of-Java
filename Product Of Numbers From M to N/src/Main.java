import java.util.Scanner;
class jk{
    public static void main(String[]args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the Number for M: ");
        int M = sc.nextInt();
        if(M>101){
            System.out.println("Enter Below 101...!");
            return;
        }
        System.out.print("Enter the Number for N: ");
        int N = sc.nextInt();
        if(N>121) {
            System.out.println("Enter Below 121...!");
            return;
        }
        int Product = 1;

        for(int i = M;i<=N;i++){
            Product*=i;
        }
        System.out.print(Product);
    }
}