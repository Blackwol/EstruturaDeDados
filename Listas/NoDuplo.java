
public class NoDuplo {

	   private NoDuplo anterior;      
	   private NoDuplo proximo;
	   private Object elemento;      
	   
	   public void setElemento(Object elemento) {
	      this.elemento = elemento;
	   }
	   
	   public Object getElemento() {
	      return elemento;
	   }
	   
	   public void setAnterior(NoDuplo anterior) {
	      this.anterior = anterior;
	   }
	   
	   public NoDuplo getAnterior() {
	      return anterior;
	   }
	   
	   public void setProximo(NoDuplo proximo) {
	      this.proximo = proximo;
	   }
	   
	   public NoDuplo getProximo() {
	      return proximo;
	   }
}
