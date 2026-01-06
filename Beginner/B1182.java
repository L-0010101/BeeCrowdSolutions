import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [][] matrix = new double[12][12];
        int col = in.nextInt();
        double result = 0;
        String T = in.next();
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++) {
                matrix[j][i] = in.nextDouble();
            }
        }
        if (T.equalsIgnoreCase("S")){
            for (int i = 0; i < 12; i++) {
                result += matrix[i][col];
            }
            System.out.printf("%.1f \n", result);
        }
        else if (T.equalsIgnoreCase("M")){
            for (int i = 0; i < 12; i++) {
                result += matrix[i][col];
            }
            result /= 12;
            System.out.printf("%.1f \n", result);
        }
    }
}
