import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = 1;
        double nota1;
        double nota2;
        while (X == 1){
            nota1 = -1;
            nota2 = -1;
            while (nota1 < 0 || nota1 > 10) {
                nota1 = in.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("nota invalida");
                }
            }
            while (nota2 < 0 || nota2 > 10) {
                nota2 = in.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("nota invalida");
                }
            }
            System.out.printf("media = %.2f\n", (nota1+nota2)/2);
            X = 3;
            while (X < 1 || X > 2){
                System.out.println("novo calculo (1-sim 2-nao)");
                X = in.nextInt();
            }
        }
    }
}
