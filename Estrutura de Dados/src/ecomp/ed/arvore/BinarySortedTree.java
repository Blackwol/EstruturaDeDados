package ecomp.ed.arvore;

import java.util.LinkedList;

import ecomp.ed.lista.ListaLigadaSimples;
import exception.ArvoreNaoExisteException;

public class BinarySortedTree<T> implements TADTree<Comparable> {

	private BinarySortedNode<Comparable> raiz;
	private int quantidade;
	private int count = 0;
	
	public void add(Comparable o) {
		if (raiz != null) {
			BinarySortedNode<Comparable> novo = new BinarySortedNode<Comparable>();
			novo.setElemento(o);
			BinarySortedNode<Comparable> p = raiz;
			while (p != null) {
				if (p.getElemento().equals(o)) {
					break;
				} else if (p.getElemento().compareTo(o) < 0) {
					if (p.getRight() != null)
						p = p.getRight();
					else {
						p.setRight(novo);
						quantidade++;
						break;
					}
				} else {
					if (p.getLeft() != null)
						p = p.getLeft();
					else {
						p.setLeft(novo);
						quantidade++;
						break;
					}
				}
			}
		} else {
			BinarySortedNode<Comparable> novo = new BinarySortedNode<Comparable>();
			novo.setElemento(o);
			raiz = novo;
			quantidade++;
		}
	}

	public boolean contains(Comparable o) {
		return (getNo(o) != null);
	}
	
	private BinarySortedNode<Comparable> getNo(Comparable o) {
		BinarySortedNode<Comparable> r = null;
		if (raiz != null) {
			BinarySortedNode<Comparable> p = raiz;
			while (p != null) {
				if (p.getElemento().equals(o)) {
					r = p; 
					break;
				} else if (p.getElemento().compareTo(o) < 0) {
					p = p.getRight();
				} else {
					p = p.getLeft();
				}
			}
		}
		return r;
	}
	
	
	public int getNivelNo(Comparable pai) {
		int r = -1;
		if (raiz != null) {
			int nivel = 0;
			BinarySortedNode<Comparable> p = raiz;
			while (p != null) {
				if (p.getElemento().equals(pai)) {
					r = nivel; 
					break;
				} else if (p.getElemento().compareTo(pai) < 0) {
					p = p.getRight();
				} else {
					p = p.getLeft();
				}
				nivel++;
			}
		}
		return r;
	}
	

	public boolean remove(Comparable o) {
		boolean r = false;
		if (raiz != null) {
			if (raiz.getElemento().equals(o)) {
				r = true;
				quantidade--;
				if (raiz.getLeft() == null) {
					raiz = raiz.getRight();
				} else if (raiz.getRight() == null) {
					raiz = raiz.getLeft();
				} else {
					// raiz possui as duas ramificacoes
					// seguimos em busca do maior elemento 'a esquerda da raiz
					BinarySortedNode<Comparable> p = raiz.getLeft();
					BinarySortedNode<Comparable> paiP = raiz;
					while (p.getRight() != null) {
						// desce para direita
						paiP = p;
						p = p.getRight();
					}
					// faz a copia do elemento de p para a raiz
					raiz.setElemento(p.getElemento());
					// verifica como a remocao de p deve ser realizada
					if (paiP == raiz) {
						paiP.setLeft(p.getLeft());
					} else {
						paiP.setRight(p.getLeft());
					}
				}
			} else {
				// o elemento a ser removido nao é a raiz ...
				BinarySortedNode<Comparable> paiAux = raiz;
				BinarySortedNode<Comparable> aux = raiz;
				while (aux != null) {
					// procurando o elemento a ser removido
					if (aux.getElemento().equals(o)) {
						// encontrei o elemento
						break;
					} else if (aux.getElemento().compareTo(o) < 0) {
						paiAux = aux;
						aux = aux.getRight();
					} else {
						paiAux = aux;
						aux = aux.getLeft();
					}
				}
				if (aux != null) {
					// encontramos o elemento
					r = true;
					quantidade--;
					if (aux.getLeft() == null) {
						if (aux == paiAux.getLeft()) {
							paiAux.setLeft(aux.getRight());
						} else {
							paiAux.setRight(aux.getRight());
						}
					} else if (aux.getRight() == null) {
						if (aux == paiAux.getLeft()) {
							paiAux.setLeft(aux.getLeft());
						} else {
							paiAux.setRight(aux.getLeft());
						}
					} else {
						// o elemento que preciso remover possui duas subarvores
						// buscar o maior elemento a esquerda para substituir ...
                        BinarySortedNode<Comparable> remover = aux;
						
						while(aux.getRight() != null){
							paiAux = aux;
							aux = aux.getRight();
						}
						remover.setElemento(aux.getElemento());
					}
				}
			}
		}
		return r;
	}

	public int size() {
		return quantidade;
	}
	
	public void exploreTree(int option) {
		if (option < 0) {
			System.out.println("Percurso em pré-ordem: ");
			exploreTreePreOrder(raiz);
		} else if (option == 0) {
			System.out.println("Percurso em ordem: ");
			exploreTreeInOrder(raiz);
		} else if(option == 1) {
			System.out.println("Percurso em pós-ordem: ");
			exploreTreePostOrder(raiz);
		}
		else{
			System.out.println("Ordem decrescente: ");
			exploreTreeDecrescente(raiz);
		}
	}

	private void exploreTreeDecrescente(BinarySortedNode<Comparable> p){
		if(p != null){
			exploreTreeDecrescente(p.getRight());
			System.out.println(p.getElemento());
			exploreTreeDecrescente(p.getLeft());
		}
	}
	
	private void exploreTreePreOrder(BinarySortedNode<Comparable> p) {
		if (p != null) {
			System.out.println(p.getElemento());
			exploreTreePreOrder(p.getLeft());
			exploreTreePreOrder(p.getRight());
		}
	}
	
	private void exploreTreeInOrder(BinarySortedNode<Comparable> p) {
		if (p != null) {
			exploreTreeInOrder(p.getLeft());
			System.out.println(p.getElemento());
			exploreTreeInOrder(p.getRight());
		}
	}
	
	private void exploreTreePostOrder(BinarySortedNode<Comparable> p) {
		if (p != null) {
			exploreTreePostOrder(p.getLeft());
			exploreTreePostOrder(p.getRight());
			System.out.println(p.getElemento());
		}
	}
	
	private int getAlturaNo(BinarySortedNode<Comparable> p) {
		if (p != null) {
			int altEsq = getAlturaNo(p.getLeft());
			int altDir = getAlturaNo(p.getRight());
			int altP = (altEsq > altDir) ? altEsq+1 : altDir+1;
			return altP;
		} else {
			// caso base da recursao
			return -1;
		}
	}
	
	public int getAlturaNo(Comparable elemento) {
		int altura = -1;
		BinarySortedNode<Comparable> p = getNo(elemento);
		altura = getAlturaNo(p);
		return altura;
	}


	public BinarySortedNode buscar(Comparable o) throws ArvoreNaoExisteException{
		
		if(raiz != null){
			boolean b = false;
			BinarySortedNode<Comparable> aux = raiz;
			do{
				if(o.equals(aux.getElemento())){
					b = true;
				}
				else if(o.compareTo(aux.getElemento()) > 0){
					aux = aux.getRight();
				}
				else{
					aux = aux.getLeft();
				}
			}while(b == false);
			
			return aux;
		}
		else{
			throw new ArvoreNaoExisteException("Arvore nao existe!");
		}
		
	}
	
	
	public String printLine(Comparable valor, int valor2) throws ArvoreNaoExisteException{
		
		BinarySortedNode<Comparable> node = buscar(valor);
		
		if(node == null){
			return "";
		}
		
		String aux = "";
		
		//Imprmir a linha
		if(getNivelNo(valor) == valor2){
			aux = node.getElemento() + "";
		}
		String aux2 = " ";
		
		//Percorrer a arvore
		if(node.getLeft() != null){
			aux2 += printLine(node.getLeft().getElemento(), valor2);
		}
		if(node.getRight() != null){
			aux2 += printLine(node.getRight().getElemento(), valor2);
		}
		
		aux += aux2;
		return aux;
	}
	
	
	public void printTree() throws ArvoreNaoExisteException{
        
		if(raiz != null){
			
			int aux = getAlturaNo(raiz);
			
			for(int i = 0; i <= aux; i++){
				for(int j = 0; j < aux - i; j++){
					System.out.println("    ");
				}
				
				System.out.println(printLine(this.raiz.getElemento(), i));
			}
		}
		else{
			throw new ArvoreNaoExisteException("Arvore nao existe!");
		}
	}
	
	
	 //Método imprimir
//	int aux = getAlturaNo(raiz);
//	
//	for(int i = 0; i <= aux; i++){
//		for(int j = 0; j < aux - i; j++){
//			System.out.println("    ");
//		}
//		
//		System.out.println(printLine(this.raiz.getElemento(), i));
//	}
	
}
