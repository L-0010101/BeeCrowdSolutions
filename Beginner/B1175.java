import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] N = new int[20];
		for(int i = 0; i < N.length; i++){
		    N[19-i] = in.nextInt();
		}
		for(int i = 0; i < N.length; i++){
    	    System.out.println("N["+i+"] = "+N[i]);
		}
	}
}
