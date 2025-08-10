import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int tempo = 0;
            int CiA = in.nextInt();
            int CiB = in.nextInt();
            double CrA = in.nextDouble();
            double CrB = in.nextDouble();
            while (CiA <= CiB){
                CiA += (int)((CiA*CrA)/100);
                CiB += (int)((CiB*CrB)/100);
                tempo++;
            }
            if(tempo <= 100){
                System.out.println(tempo + " anos.");
            } else {
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}
