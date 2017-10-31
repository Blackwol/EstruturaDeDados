package ecomp.ed.lista;

public class ExemploLista {

	public static void main(String[] args) {
		
		TADLista lista = new ListaLigadaSimples();

		lista.add("Byron");
		lista.add("Carlos");
		lista.add("Sergio");
		lista.add("Maria");
		lista.add("Joao");
		
		System.out.println("Tamanho da lista: " + lista.size());
		
		if (lista.contains("Sergio")) {
			int index = lista.indexOf("Sergio");
			System.out.println("Posicao de Sergio na lista: " + index);
			lista.remove("Carlos");
			System.out.println("Carlos removido da lista, novo tamanho: " + lista.size());
			index = lista.indexOf("Sergio");
			System.out.println("Posicao de Sergio na lista: " + index);
		}

	}

}
