import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1 = -1;
        double nota2 = -1;
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
        System.out.printf("media = %.2f\n", (nota2+nota1)/2);
    }
}
