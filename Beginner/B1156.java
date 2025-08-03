public class Main {
    public static void main(String[] args) {
        double resultado = 1;
        double S = 1;
        double D = 0;
        while(S < 39){
            if(D > 0){
                resultado += S/D;
                D*=2;
                S+=2;
            }else{
            D = 2;
            S+=2;
            }
        }
        System.out.printf("%.2f\n",resultado);
    }
}
