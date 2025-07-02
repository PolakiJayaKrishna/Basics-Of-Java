import java.util.Scanner;
class PrintInteger{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        for(int i=N;i>=1;i--){
            System.out.println(i);
        }
    }
}