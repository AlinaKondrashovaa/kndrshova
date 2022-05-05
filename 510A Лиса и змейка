import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		char[][] snake = new char[n][m];
		int k = m-1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					snake[i][j] = '#';
				}
			} else {
				for (int j = 1; j < m-1; j++) {
					snake[i][j] = '.';
				}
				if (k == m-1) {
					snake[i][k] = '#';
					snake[i][0] = '.';
					k = 0;
				} else {
					snake[i][k] = '#';
					snake[i][m-1] = '.';
					k = m-1;
				}
			}			
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(snake[i][j]);
			}
			System.out.println();
		}
	}
