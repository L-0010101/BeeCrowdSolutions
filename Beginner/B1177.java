import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int j = 0;
        for (int i = 0; i < 1000; i++){
            System.out.println("N["+i+"] = "+j);
            if (j < T-1){
                j++;
            } else if (j == T-1){
                j=0;
            }
        }
    }
}
