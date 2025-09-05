import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double X = in.nextDouble();
        int [] N = new int[100];
        for (int i = 0; i < N.length; i++){
            System.out.print("N["+i+"] = ");
            System.out.printf("%.4f\n", X);
            X /= 2;
        }
    }
}
