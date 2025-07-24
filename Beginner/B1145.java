import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int contador = 1;
        for (int i = 1; i < Y && contador < Y; i++){
            for (int j = 0; j < X && contador <= Y; j++){
                if (contador == Y || j == X-1){
                    System.out.print(contador+"\n");
                    contador++;
                } else {
                    System.out.print(contador + " ");
                    contador++;
                }
            }
        }
    }
}
