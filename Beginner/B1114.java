import java.util.Scanner;

public class B1114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int password = 2002;
        int quebra = 1;
        while (quebra == 1){
            int passwordIn = in.nextInt();
            if(passwordIn != password){
                System.out.println("Senha Invalida");
            }
            else if (passwordIn == password){
                System.out.println("Acesso Permitido");
                quebra = 0;
            }
        }
    }
}
