package ecomp.ed.arvore;

import exception.ArvoreNaoExisteException;
import exception.ElementoNaoEncontradoException;

public class TesteArvore {

	public static void main(String[] args) throws ElementoNaoEncontradoException, ArvoreNaoExisteException {
		BinarySortedTree<String> arvore = new BinarySortedTree<String>();
		
//		try{
			arvore.add("Carlos");
			arvore.add("Maria");
			arvore.add("Bruno");
			arvore.add("Antonio");
			arvore.add("Ana");
			arvore.add("Pedro");
			arvore.add("Eduardo");
//			System.out.println("Tamanho da arvore: " + arvore.size());
//			arvore.remove("Bruno");
//			System.out.println("Tamanho da arvore: " + arvore.size());
//			System.out.println(arvore.contains("Ana"));
//			System.out.println(arvore.contains("Eduarda"));
//			System.out.println(arvore.contains("Maria"));
//			System.out.println(arvore.contains("Bruno"));
		
		    arvore.exploreTree(TADTree.PRE_ORDER_EXPLORE);
		    arvore.exploreTree(TADTree.IN_ORDER_EXPLORE);
		    arvore.exploreTree(TADTree.POST_ORDER_EXPLORE);		
			arvore.exploreTree(TADTree.DECRESCENTE);
//			arvore.remove("Pacifico");
			
//		}
//		catch(ArvoreNaoExisteException a){
//			System.out.println("Arvore nao existe!");
//		}
//		catch(ElementoNaoEncontradoException a){
//			System.out.println("Elemento nao encontrado!");
//		}
		
		
//		TADTree<Comparable> arvoreNumerica = new BinarySortedTree<String>();
//		
//		try{
//			arvoreNumerica.add(20);
//			arvoreNumerica.add(5);
//			arvoreNumerica.add(30);
//			arvoreNumerica.add(36);
//			arvoreNumerica.add(10);
//			arvoreNumerica.add(25);
//			System.out.println("Tamanho: "+ arvoreNumerica.size());
//			arvoreNumerica.remove(30);
//			System.out.println("Tamanho: " + arvoreNumerica.size());
//			System.out.println(arvoreNumerica.contains(10));
//			System.out.println(arvoreNumerica.contains(36));
//			System.out.println(arvoreNumerica.contains(30));
//		}catch(ArvoreNaoExisteException a){
//			System.out.println("Arvore nao existe!");
//		}catch(ElementoNaoEncontradoException a){
//			System.out.println("Elemento nao encontrado!");
//		}
//		
//		
//		TADTree<Comparable> arvoreTeste = new BinarySortedTree<String>();
		
//		try{
//			arvoreTeste.printTree();
//		}catch(ArvoreNaoExisteException a){
//			System.out.println("Arvore nao existe!");
//		}
//		
//		arvoreTeste.add(30);
//		
//		try{
//			arvoreTeste.printTree();
//		}catch(ArvoreNaoExisteException a){
//			System.out.println("Arvore nao existe!");
//		}
		
//		try{
//			arvore.add("Carlos");
//			arvore.add("Maria");
//			arvore.add("Bruno");
//			arvore.add("Antonio");
//			arvore.add("Ana");
//			arvore.add("Pedro");
//			arvore.add("Eduardo");
//			
//			arvore.printTree();
//		}catch(ArvoreNaoExisteException a){
//			System.out.println("Arvore nao existe!");
//		}
	}

}
