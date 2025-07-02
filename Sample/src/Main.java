import java.util.Scanner;
class JK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=N+1-i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
