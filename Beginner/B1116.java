import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Z = in.nextInt();
        for (int i = 0; i < Z; i++) {
            double X = in.nextInt();
            double Y = in.nextInt();
            double N;
            if (X == 0) {
                System.out.println("0.0");
            }
            else if(Y == 0){
                System.out.println("divisao impossivel");
            } else {
                N = X/Y;
                System.out.printf("%.1f\n",N);
            }
        }
    }
}
