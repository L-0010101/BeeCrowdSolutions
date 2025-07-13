import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = 1;
        while(C == 1){
            int X = in.nextInt();
            int Y = in.nextInt();
            if (X == Y) {
                C = 0;
            }
            else if(X > Y){
                System.out.println("Decrescente");
            }
            else if(X < Y) {
                System.out.println("Crescente");
            }
        }
    }
}
