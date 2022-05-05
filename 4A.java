import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner weight = new Scanner(System.in);
        int a = weight.nextInt();
        if ((a % 2 == 0) && (a>2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
