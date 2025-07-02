import java.util.Scanner;
class SumOfFirstNEvenNumbers{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Natural Number: ");
        int N = sc.nextInt();
        int sum=0;
        for(int i=1;i<=N;i++){
            if(i%2==0)
                sum+=i;
        }
        System.out.print(sum);
    }
}