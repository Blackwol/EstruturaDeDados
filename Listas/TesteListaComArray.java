
public class TesteListaComArray {

	public static void main(String[] args){
		
		TADLista array = new ListaComArray();
		array.add("Pedro");
		array.add("Renata");
		array.add("Anna");
		array.add("Xayah");
		array.add("Rodrigo");
		
		System.out.println("Posicao de Anna: " + array.indexOf("Anna"));
		System.out.println("Posicao de Xayah: " + array.indexOf("Xayah"));
		System.out.println("Posicao de Rodrigo: " + array.indexOf("Rodrigo"));
		System.out.println("Posicao de Renata: " + array.indexOf("Renata"));
		System.out.println(array.contains("Pedro"));
		System.out.println(array.contains("Julia"));
		
	}
}
