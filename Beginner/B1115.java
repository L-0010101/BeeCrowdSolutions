import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quebra = 0;
        while(quebra == 0){
            int X = in.nextInt();
            int Y = in.nextInt();
            if(X == 0 || Y == 0){
                quebra = 1;
            }
            else if (X > 0 && Y > 0){
                System.out.println("primeiro");
            }
            else if (X > 0 && Y < 0){
                System.out.println("quarto");
            }
            else if (X < 0 && Y < 0){
                System.out.println("terceiro");
            }
            else if (X < 0 && Y > 0){
                System.out.println("segundo");
            }
        }
    }
}
