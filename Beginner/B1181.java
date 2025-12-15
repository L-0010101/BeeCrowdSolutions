import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double media = 0;
		double soma = 0;
		double [][] matriz = new double [12][12];
		int L = in.nextInt();
		String operation = in.next();
		for (int i = 0; i < 12 ; i++){
		    for (int j = 0; j < 12; j++){
		        matriz[i][j] = in.nextDouble();
		    }
		}
		if (operation.equals("S")){
		    for (int i = 0; i < 12 ; i++){
		        soma += matriz[L][i];
		    }
		    System.out.println(soma);
		}
		else if (operation.equals("M")){
		    for (int i = 0; i < 12 ; i++){
		        soma += matriz[L][i];
		        media = soma/12;
		    }
		    System.out.println(media);
		}
	}
}
