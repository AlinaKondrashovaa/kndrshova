import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        int price = 0;
        for(int i=1;i <= w;i++){
            price+=i*k;
        }
        if(price-n>0){
            System.out.println(price-n);
        }else{
            System.out.println(0);
        }
    }
}
