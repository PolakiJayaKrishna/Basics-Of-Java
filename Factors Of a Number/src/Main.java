import java.util.Scanner;
class JK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Integer: ");
        int N = sc.nextInt();
        int M = 1 ;
        for(int i=1;i<=N;i++){
            if(N%i == 0){
                System.out.println(i);
            }
        }
    }
}