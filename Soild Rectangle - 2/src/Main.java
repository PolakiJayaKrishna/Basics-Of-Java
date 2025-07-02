import java.util.Scanner;
class Solidrectangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number of Rows: ");
        int Rows = sc.nextInt();
        System.out.print("Enter a Number of Coloumns: ");
        int Coloumns = sc.nextInt();
        for(int i=1;i<=Rows;i++){
            for(int j=1;j<=Coloumns;j++){
                System.out.print(" + ");
            }
            System.out.println(" ");
        }
    }
}