import java.util.Scanner;

class jk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*(n-i)+1; j++) {
                if (i==1 || j==1 || j==2*(n-i)+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j<=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if(j==1 || j== 2*i-1 || i==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}