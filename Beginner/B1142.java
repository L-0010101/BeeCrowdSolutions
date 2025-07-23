import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int contador = 0;
        for (int i = 0; i < N; i++){
            contador++;
            System.out.println(contador+++" "+contador+++" "+contador+++" PUM");
        }
    }
}
