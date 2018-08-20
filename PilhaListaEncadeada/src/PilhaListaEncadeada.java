
public class PilhaListaEncadeada implements IPilha{
	private No topo;
	int qtd;
	
	public PilhaListaEncadeada(){
		topo = null;
	}
	public int size() {
		return qtd;
	}
	public Object top() throws EPilhaVazia {
		if(isEmpty())
			throw new EPilhaVazia("A Pilha está vazia");
		return topo.getElemento();	
	}
	public void push(Object elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		novo.setProximo(topo);
		qtd ++;
		
		topo = novo;
	}
	public Object pop() {
		Object elemento = topo.getElemento();
		topo = topo.getProximo();
		qtd --;
		return elemento;
	}
	public boolean isEmpty() {
		return(topo == null);
	}
	public void print(){
		while(topo != null){
			System.out.println("Elementos:" + topo.getElemento());
			topo = topo.getProximo();
		}
	}
}
