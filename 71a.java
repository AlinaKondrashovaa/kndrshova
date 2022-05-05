import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i=0;i<num;i++){
            String Str = scanner.next();
            if (Str.length() > 9){
                String fixed = String.valueOf(Str.charAt(0)) + (Str.length()-2) + String.valueOf(Str.charAt(Str.length()-1));
                System.out.println(fixed);
            } else {
                System.out.println(Str);
            }
        }

    }
}

