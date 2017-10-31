
public class TesteListaDupla {

	
	public static void main(String[] args){
		TADLista lista = new ListaLigadaDupla();
		
		lista.add("Pedro");
		lista.add("Julia");
		lista.add("Renata");
		lista.add("Annie");
		
		System.out.println("Posiçao de Pedro: " + lista.indexOf("Pedro"));
		System.out.println("Posiçao de Annie: " + lista.indexOf("Annie"));
		System.out.println(lista.contains("Pedro"));
		System.out.println(lista.contains("jaco"));
	}
	
}
