import java.util.Scanner;
class jk {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        int Sum=0;
        for(int i=1;i<=N;i++){
            if(N%i == 0){
                Sum+=i;
            }
        }
        System.out.print(Sum);
    }
}