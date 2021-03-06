import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	int m = scanner.nextInt();
    	int a = scanner.nextInt();
    	int b = scanner.nextInt();
    	int[] sum = new int[3];
  		sum[0] = a * n;
  		sum[1] = (n / m) * b + (n - m*(n / m)) * a;
  		sum[2] = ((n / m) + 1) * b;
  		int min = Integer.MAX_VALUE;
  		for (int i = 0; i < 3; i++) {
  			if (sum[i] < min) {
  				min = sum[i];
  			}
  		}
  		System.out.println(min);
    }
}
