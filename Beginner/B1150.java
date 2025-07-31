import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Z;
        int Y = X;
        int soma = 0;
        while((Z = in.nextInt())<=X) {
        }
        while(Y < Z){
            Y+=X;
            soma++;
        }
        System.out.println(soma);
    }
}
