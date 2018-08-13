
public class No {
	private Object elemento;
    private No proximo;

    public void setElemento(Object elemento){
        this.elemento = elemento;
    }
    public Object getElemento(){
        return this.elemento;
    }
    public void setProximo(No proximo) {
    	this.proximo = proximo;
    }
    public No getProximo() {
    	return this.proximo;
    }
}
