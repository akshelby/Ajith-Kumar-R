import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i=1; i< num * 2; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }
        }
    }
}
