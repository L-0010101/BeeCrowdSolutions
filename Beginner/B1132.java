import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int sum = 0;
        if (X > Y){
            for (int i = Y; i <= X; i++){
                if(i%13 != 0){
                    sum += i;
                }
            }
        } else if (X < Y){
            for (int i = X; i <= Y; i++){
                if(i%13 != 0){
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
