import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        for (int i = 0; i < N; i++){
            
            int X = in.nextInt();
            int Y = in.nextInt();
            int impares = 0;
            int soma = 0;
            
            while(impares != Y){
                if (X % 2 == 0){
                    X++;
                } else {
                    soma+=X;
                    X++;
                    impares++;
                }
            }
            
            System.out.println(soma);
            
        }
    }
}
