package ecomp.ed.fila;
import ecomp.ed.lista.NoSimples;

public class FilaDinamica implements TADFila {

	private NoSimples inicio, fim;
	
	private int quantidade;
	
	public void enqueue(Object o) {
		NoSimples novo = new NoSimples();
		novo.setElemento(o);
		if (isEmpty()) {
			inicio = novo;
			fim = novo;
		} else {
			fim.setProximo(novo);
			fim = novo;
		}
		quantidade++;
	}

	public Object dequeue() {
		Object r = null;
		
		if (! isEmpty()) {
			r = inicio.getElemento();
			inicio = inicio.getProximo();
			if (inicio == null)
				fim = null;
			    quantidade--;
		} else 
			throw new RuntimeException("Fila vazia!");
		
		return r;
	}

	public Object getFirst() {
		Object r = null;
		
		if (! isEmpty()) {
			r = inicio.getElemento();
		} else 
			throw new RuntimeException("Fila vazia!");
		
		return r;
	}

	public int size() {
		return quantidade;
	}

	public boolean isEmpty() {
		return quantidade == 0;
	}

	public boolean isFull() {
		return false;
	}
	

}
