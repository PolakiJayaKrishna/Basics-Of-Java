import java.util.Scanner;
class jk {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int N = sc.nextInt();
        System.out.print("Enter Power to The Number: ");
        int M = sc.nextInt();
        int E=1;
        for (int i = 1; i <= M; i++) {
            E*=N;
        }
        System.out.print(E);
    }
}