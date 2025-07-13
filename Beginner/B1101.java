import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = 1;
        while(C == 1){
            int N = in.nextInt();
            int M = in.nextInt();
            int result = 0;
            if(N <= 0 || M <= 0){
                C = 0;
            }
            else if(N > M){
                for (int i = M; i <= N; i++) {
                    System.out.print(i+" ");
                    result += i;
                }
                System.out.print("Sum="+result+"\n");
            }
            else if(N < M){
                for (int i = N; i <= M; i++) {
                    System.out.print(i+" ");
                    result += i;
                }
                System.out.print("Sum="+result+"\n");
            }
            else if(N == M){
                System.out.println(N+" ");
                System.out.print("Sum="+result);
            }
        }
    }
}
