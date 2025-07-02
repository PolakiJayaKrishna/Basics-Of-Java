import java.util.Scanner;
class SolidSquare {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}