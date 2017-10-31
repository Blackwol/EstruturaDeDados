
public class ListaComArray implements TADLista {
	private Object[] elementos;
	private int quantidade;
	public ListaComArray() {
		elementos = new Object[10];
		quantidade = 0;
	}
	
	public void add(Object o) {
		if (quantidade < elementos.length) {
			elementos[quantidade] = o;
			quantidade++;
		} else {
			throw new RuntimeException("Lista cheia!");
		}
		
		Object aux = null;
		for(int i = 0; i < quantidade;i++){
			for(int j = 0; j < quantidade; j++){
				Object elem1 = elementos[i];
				Object elem2 = elementos[j];
				if(elem1.toString().charAt(0) < elem2.toString().charAt(0)){
					aux = elem1;
					elementos[i] = elem2;
					elementos[j] = aux;
				}
				else if(elem1.toString().charAt(0) == elem2.toString().charAt(0)){
					if(elem1.toString().charAt(1) < elem2.toString().charAt(1)){
						aux = elem1;
						elementos[i] = elem2;
						elementos[j] = aux;
					}
				}
			}
		}
	}
	
	public boolean contains(Object o) {
		boolean r = false;
		int direita = quantidade - 1, esq = 0, meio;
		while(esq <= direita){
			meio = (direita + esq)/2;
			if(o.equals(elementos[meio])){
				r = true;
				break;
			}			
			else if(o.toString().charAt(0) < elementos[meio].toString().charAt(0)){
				direita = meio - 1;
			}
			else{
				esq = meio + 1;
			}
		}
		return r;
	}
	
	public int indexOf(Object o) {

		int r = -1;
		int direita = quantidade - 1, esq = 0, meio;
		while(esq <= direita){
			meio = (direita + esq)/2;
			if(o.equals(elementos[meio])){
				r = meio;
				break;
			}			
			else if(o.toString().charAt(0) < elementos[meio].toString().charAt(0)){
				direita = meio - 1;
			}
			else{
				esq = meio + 1;
			}
		}
		return r;
	}
	
	public boolean remove(Object o) {
		boolean r = false;
		for (int i = 0; i < quantidade; i++) {
			if (o.equals(elementos[i])) {
				r = true;
				// deslocar os elementos a frente
				while (i < quantidade-1) {
					elementos[i] = elementos[i+1];
					i++;
				}
				quantidade--;
				elementos[quantidade] = null;
				break;
			}
		}
		return r;
	}

	public int size() {
		return quantidade;
	}
	
}
