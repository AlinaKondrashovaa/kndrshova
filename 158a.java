import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        int k = scan.nextInt();
        int a[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        for (int i : a){
            if ((i >= a[k - 1]) && (i > 0)){
                count++;
            }else{
                break;
            }
        }
        System.out.println(count);
	}
