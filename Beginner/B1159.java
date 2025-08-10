import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int X = in.nextInt();
        
        while (X != 0){
            
            int pares = 0;
            int soma = 0;
            
            while (pares < 5){
                
                if (X % 2 == 0){
                    soma+=X;
                    X++;
                    pares++;
                } else {
                    X++;
                }
                
            }
            
            System.out.println(soma);
            X = in.nextInt();
            
        }
    }
}
