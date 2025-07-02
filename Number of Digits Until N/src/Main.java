import java.util.Scanner;
class Jk {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        int Count=0,Number;
        for(int i=1;i<=N;i++){
            Number = i;
            while(Number != 0){
                Count++;
                Number /=10;
            }
        }
        System.out.print(Count);
    }
}