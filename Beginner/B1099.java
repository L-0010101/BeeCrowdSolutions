import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int result;
        for (int i = 0; i < N; i++){
            result = 0;
            int X = in.nextInt();
            int Y = in.nextInt();
            if (X > Y){
                for (int j = Y+1; j < X; j++) {
                    String strJ = String.valueOf(j);
                    if (strJ.endsWith("1") || strJ.endsWith("3") || strJ.endsWith("5") || strJ.endsWith("7") || strJ.endsWith("9")){
                        result += j;
                    }
                }
                System.out.println(result);
            }
            else if (Y > X){
                for (int j = X+1; j < Y; j++) {
                    String strJ = String.valueOf(j);
                    if (strJ.endsWith("1") || strJ.endsWith("3") || strJ.endsWith("5") || strJ.endsWith("7") || strJ.endsWith("9")){
                        result += j;
                    }
                }
                System.out.println(result);
            } else {
                System.out.println(0);
            }
        }
    }
}
