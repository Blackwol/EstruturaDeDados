package ecomp.ed.pilha;
public class ExemploPilha {

	public static void main(String[] args) {
		TADPilha p = new PilhaComArray();
		
		for (int i=0; i<20; i++) {
			String o = "" + ((char)("A".charAt(0) + i));
			p.push(o);
			System.out.println("TOP() -> " + p.top());
		}
		
		for (int i=0; i<10; i++) {
			System.out.println("POP() -> " + p.pop());
		}

		System.out.println("SIZE = " + p.size());
	}

}
