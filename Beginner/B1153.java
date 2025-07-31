import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        int N = loop;
        for (int i = 1; i < loop; i++){
            N = N*(loop-i);
        }
        System.out.println(N);
    }
}
