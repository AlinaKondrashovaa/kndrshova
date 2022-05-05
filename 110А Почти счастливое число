import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String nch = String.valueOf(n);
        if ((n % 4 == 0) || (n % 7 == 0) || (n % 47 == 0) || (n % 74 == 0)) {
            System.out.println("YES");
        } else {
            boolean happyn = false;
            for (int i = 0; i < nch.length(); i++) {
                if (nch.charAt(i) == '4' || nch.charAt(i) == '7') {
                    happyn = true;
                } else {
                    happyn = false;
                    break;
                }
            }
            if (happyn) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
