import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int len = A.length();
        String compString = "";
        for (int i = len - 1; i >= 0; i--) {
            compString += A.charAt(i);
        }
        if (A.equals(compString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
