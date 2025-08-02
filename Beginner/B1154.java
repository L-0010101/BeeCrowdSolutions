import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double idades = 0;
        int loops = 0;
        boolean loop = true;
        while(loop){
            double idade = in.nextDouble();
            if(idade >= 0){
                idades+=idade;
                loops++;
            } else {
                loop = false;
            }
        }
        System.out.printf("%.2f\n",idades/loops);
    }
}
