import java.util.Scanner;
class jk {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Intial Number: ");
        int M = sc.nextInt();
        System.out.print("Enter a Final Number: ");
        int N = sc.nextInt();
        int sum = 0;
        for(int i=M;i<=N;i++){
            if(i%2 == 0)
                sum+=i;
        }
        System.out.print(sum);
    }
}