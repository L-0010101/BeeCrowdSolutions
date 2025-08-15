import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [] A = new double[100];
        for (int i = 0; i < A.length; i++){
            A[i] = in.nextDouble();
            if (A[i] <= 10){
                System.out.println("A["+i+"] = "+A[i]);
            }
        }
    }
}
