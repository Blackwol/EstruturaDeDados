import ecomp.ed.pilha.PilhaDinamica;
import ecomp.ed.pilha.TADPilha;

public class ConversorBase {

	private static void converterBinario(int numero) {
		TADPilha p = new PilhaDinamica();
		System.out.println("Convertendo o numero " + numero);
		while (numero >= 2) {
			int resto = numero % 2;
			p.push(new Integer(resto));
			numero = numero / 2;
		}
		System.out.print("Valor em binário: " + numero);
		while (! p.isEmpty()) {
			System.out.print(p.pop());
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		converterBinario(120);
		converterBinario(222);
		converterBinario(31);
	}

}
