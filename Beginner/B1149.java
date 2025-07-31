import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int soma = 0;
        int N = 0;
        while(N <= 0){
            N = in.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            soma += A;
            A++;
        }
        System.out.println(soma);
    }
}
