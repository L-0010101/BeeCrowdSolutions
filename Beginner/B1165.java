import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++){
            int X = in.nextInt();
            boolean naoehprimo = false;
            for (int j = 2; j < X; j++){
                if (X%j == 0){
                    naoehprimo = true;
                }
            }
            if(naoehprimo){
                System.out.println(X+" nao eh primo");
            } else {
                System.out.println(X+" eh primo");
            }
        }
    }
}
