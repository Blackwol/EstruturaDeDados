package ecomp.ed.arvore;

import ecomp.ed.lista.ListaLigadaSimples;
import ecomp.ed.lista.TADLista;

public class TreeNode {

	private Object elemento;
	private TADLista filhos;
	
	public TreeNode() {
		filhos = new ListaLigadaSimples();
	}
	
	public Object getElemento() {
		return elemento;
	}
	
	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}
	
	public void addFilho(TreeNode o) {
		filhos.add(o);
	}
	
	public boolean containsFilho(TreeNode o) {
		return filhos.contains(o);
	}
	
	public void remove(TreeNode o) {
		filhos.remove(o);
	}
}
