import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int loop = in.nextInt();
        int N1 = 0;
        int N1antes;
        int N2 = 1;
        for (int i = 0; i < loop; i++) {
            if (i == 0){
                System.out.print(N1+" ");
                N1antes = N1;
            } else {
                    if (i == loop-1){
                        System.out.print(N2 + "\n");
                    } else {
                        System.out.print(N2 + " ");
                        N1antes = N1;
                        N1 = N2;
                        N2 += N1antes;
                }
            }
        }
    }
}
