package Beginner;

import java.util.Scanner;

public class B1131 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        int empates = 0;
        int grenais = 0;
        int grenal = 1;
        int interv = 0;
        int gremiov = 0;
      
        while(grenal == 1){
            int inter = in.nextInt();
            int gremio = in.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            grenal = in.nextInt();
            grenais++;

            if (gremio < inter){
                interv++;
            } else if (gremio > inter) {
                gremiov++;
            } else if (gremio == inter) {
                empates++;
            }

            if(grenal == 2){
                System.out.println(grenais+" grenais");
                System.out.println("Inter:"+interv);
                System.out.println("Gremio:"+gremiov);
                System.out.println("Empates:"+empates);
                if (interv > gremiov){
                    System.out.println("Inter venceu mais");
                } else if (gremiov > interv) {
                    System.out.println("Gremio venceu mais");
                } else if (gremiov == interv) {
                    System.out.println("Não houve vencedor");
                }
            } 
        }
    }
}
