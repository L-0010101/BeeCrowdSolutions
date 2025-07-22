import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        if (X > Y){
            for (int i = Y+1; i < X; i++){
                if (i%5 == 2 || i%5 == 3){
                    System.out.println(i);
                }
            }
        }
        if (X < Y){
            for (int i = X+1; i < Y; i++){
                if (i%5 == 2 || i%5 == 3){
                    System.out.println(i);
                }
            }
        }
    }
}
