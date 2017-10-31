
public class ListaLigadaDupla implements TADLista {

	private int quantidade;
	private NoDuplo inicio;
	private NoDuplo fim;
	
	public void add(Object o) {

		NoDuplo novo = new NoDuplo();
		novo.setElemento(o);
		if(inicio == null){
			fim = novo;
			inicio = novo;
			quantidade++;
		}
		else if(o.toString().charAt(0) <= inicio.toString().charAt(0)){
			novo.setProximo(inicio);
			inicio = novo;
			quantidade++;
		}
		else if(o.toString().charAt(0) > inicio.toString().charAt(0)){
			novo.setAnterior(fim);
			fim = novo;
			quantidade++;
		}
	}

	
	public boolean contains(Object o) {

		boolean r = false;
		int direita = quantidade - 1, esq = 0, meio;
		NoDuplo p = inicio;
		while(esq <= direita){
			meio = (direita + esq)/2;
			if(o.equals(p.getElemento())){
				r = true;
				break;
			}
			else if(o.toString().charAt(0) < p.toString().charAt(0)){
				direita = meio - 1;
			}
			else if(o.toString().charAt(0) > p.toString().charAt(0)){
				esq = meio + 1;
			}
			p = p.getProximo();
		}
		
		return r;
	}

	
	public int indexOf(Object o) {

		int r = -1;
		NoDuplo p = inicio;
		int direita = quantidade -1, esq = 0, meio;
		while (esq <= direita){
			meio = (direita + esq)/2;
			if(o.equals(p.getElemento())){
				r = meio;
				break;
			}
			else if(o.toString().charAt(0) < p.toString().charAt(0)){
				direita = meio - 1;
			}
			else if(o.toString().charAt(0) > p.toString().charAt(0)){
				esq = meio + 1;
			}
			p = p.getProximo();
        }
		
		return r;
	}

	
	public boolean remove(Object o) {

		boolean r = false;
		if (inicio != null) {
			if (inicio.getElemento().equals(o)) {
				inicio = inicio.getProximo();
				quantidade--;
				r = true;
			} else {
				NoDuplo p = inicio;
				for (int i = 0; i < quantidade-1; i++) {
					if (o.equals(p.getProximo().getElemento())) {
						r = true;
						p.setProximo(p.getProximo().getProximo());
						quantidade--;
						break;
					}
					p = p.getProximo();
				}		
			}
		}
		return r;
	}

	
	public int size() {

		return quantidade;
	}


	
}
