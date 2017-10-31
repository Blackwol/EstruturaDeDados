package ecomp.ed.lista;

public interface TADLista<T> {

	public void add(T o);
	
	public boolean contains(T o);
	
	public int indexOf(T o);
	
	public boolean remove(T o);
	
	public int size();
}
