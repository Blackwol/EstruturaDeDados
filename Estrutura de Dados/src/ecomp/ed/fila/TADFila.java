package ecomp.ed.fila;

public interface TADFila {

	public void enqueue(Object o);
	
	public Object dequeue();
	
	public Object getFirst();
	
	public int size();
	
	public boolean isEmpty();
	
	public boolean isFull();
}
