import java.util.Scanner;
class Loops {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number To Print Numbers In Right Angle Triangle Format: ");
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}