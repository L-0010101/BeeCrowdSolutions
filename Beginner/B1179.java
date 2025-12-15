import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] par  = new int[5];
		int [] impar  = new int[5];
		int parpos = 0;
		int imparpos = 0;
		for(int i = 0; i < 15; i++){
		    int X = in.nextInt();
		    if (parpos == 5){
		        parpos = 0;
		        for(int j = 0; j < par.length; j++){
		            System.out.println("par["+j+"] = "+par[j]); //par[0] = 4
		        }
		    }
		    if (imparpos == 5){
		        imparpos = 0;
		        for(int j = 0; j < impar.length; j++){
		            System.out.println("impar["+j+"] = "+impar[j]); //impar[0] = 3
		        }
		    }
		    if (X%2 == 0){
		        par[parpos] = X;
		        parpos++;
		    } else {
		        impar[imparpos] = X;
		        imparpos++;
		    }
		}
		for(int i = 0; i < imparpos; i++){
		    System.out.println("impar["+i+"] = "+impar[i]);
		}
		for(int i = 0; i < parpos; i++){
		    System.out.println("par["+i+"] = "+par[i]);
		}
	}
}
