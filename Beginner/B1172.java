import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] X = new int[10];
        for (int i = 0; i < X.length; i++){
            int N = in.nextInt();
            if (N > 0){
                X[i] = N;
            } else {
                X[i] = 1;
            }
            System.out.println("X["+i+"] = "+X[i]);
        }
    }
}
