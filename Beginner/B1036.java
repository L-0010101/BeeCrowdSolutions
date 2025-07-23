import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double delta = Math.sqrt(B*B-4*A*C);
        if(A == 0 || (B*B-4*A*C) < 0){
            System.out.println("Impossivel calcular");
        } else {
            double res1 = (-B + delta) / (A*2);
            double res2 = (-B - delta) / (A*2);
            System.out.printf("R1 = %.5f\n",res1);
            System.out.printf("R2 = %.5f\n",res2);
        }
    }
}
