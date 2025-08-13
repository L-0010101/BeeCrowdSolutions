import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.println("N["+i+"] = "+N);
            N*=2;
        }
    }
}
