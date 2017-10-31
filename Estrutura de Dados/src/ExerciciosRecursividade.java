
public class ExerciciosRecursividade {

	public static int imprimir(int n) {
		if (n<10) {
			System.out.println("Digito 1: " + n);
			return 1;
		} else {
			int resto = n%10;
			int cont = imprimir(n/10);
			System.out.println("Digito " + (cont+1) + ": " + resto);
			return cont+1;
		}
	}
	
	public static int mdc(int a, int b) {
		if (a % b == 0) 
			return b;
		else if (b % a == 0) 
			return a;
		else {
			int maior = (a>b) ? a:b;
			int menor = (a<b) ? a:b;
			int resto = maior % menor;
			return mdc(menor, resto);
		}
	}
	
	public static void main(String[] args) {
		imprimir(36000);
		//System.out.println(mdc(20,70));
	}

}
