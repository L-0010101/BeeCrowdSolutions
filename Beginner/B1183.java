import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double [][] matrix = new double[12][12];
        double result = 0;
        String O = in.nextLine();
        for (int i = 0; i < 12; i++){
            for (int j = 0; j < 12; j++) {
                matrix[j][i] = in.nextDouble();
            }
        }
        if (O.equals("S")){
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < i; j++) {
                    result += matrix[i][j];
                }
            }
        }
        else if (O.equals("M")){
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < i; j++) {
                    result += matrix[i][j];
                }
            }
            result /= 66;
        }
        System.out.printf("%.1f \n", result);
    }
}
