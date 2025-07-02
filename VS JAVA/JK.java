import java.util.Scanner;
public class JK {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int N = sc.nextInt();
		int i , j;
		for(i=1;i<=N;i++){
			for(j=1;j<=N-i;j++){
				System.out.print(" ");
			}
			for (int j2 = 1; j2 <=2*i-1; j2++) {
                if (j2==1 || j2==2*i-1 || i==N) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
			}
			System.out.println();
		}
 	}
}