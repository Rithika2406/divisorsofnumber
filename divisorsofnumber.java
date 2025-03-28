import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " "); 
            }
        }
    }
}
