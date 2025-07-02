import java.util.Scanner;
class SolidRightAngledTriangle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if((i+j) >= (N + 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println( );
        }
    }
}