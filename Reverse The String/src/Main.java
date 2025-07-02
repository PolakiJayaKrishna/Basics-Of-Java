import java.util.Scanner;
class JK {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = sc.nextLine();
        String Reveresed_String = " ";
        for(int i= string.length() -1;i>=0;i--){
            Reveresed_String+=string.charAt(i);
        }
        System.out.print(Reveresed_String);
    }
}