package ecomp.ed.arvore;

import exception.ArvoreNaoExisteException;
import exception.ElementoNaoEncontradoException;

public interface TADTree<T> {

	public static final int PRE_ORDER_EXPLORE = -1;
	public static final int IN_ORDER_EXPLORE = 0;
	public static final int POST_ORDER_EXPLORE = 1;
	public static final int DECRESCENTE = 2;
	
	public void add(T o);
	
	public boolean contains(T o);
	
	public boolean remove(T o) throws ElementoNaoEncontradoException, ArvoreNaoExisteException;
	
	public int size();
	
    public void exploreTree(int option);
	
	public int getAlturaNo(T o);

	public int getNivelNo(T o);
	
	public void printTree() throws ArvoreNaoExisteException;
	
}
