import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++){
            int X = in.nextInt();
            int soma = 0;
            for (int j = 1; j < X; j++){
                if (X%j == 0){
                    soma+=j;
                } else {

                }
            }
            if (soma == X){
                System.out.println(X+" eh perfeito");
            } else {
                System.out.println(X+" nao eh perfeito");
            }
        }
    }
}
