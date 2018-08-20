
public class FilaListaEncadeada implements IFila{
	No inicio = null;
	No fim = null;
	int qtd = 0;
	
	public int tamanho() {
		return qtd;
	}
	public boolean estaVazia() {
		return qtd == 0;
	}
	public Object inicio() throws EFilaVazia{
		if (estaVazia())
			throw new EFilaVazia("A fila está vazia");
		return inicio;
	}
	public void enfileirar(Object elemento) {
		No novo = new No();
		novo.setElemento(elemento);
		if(estaVazia()) {
			inicio = novo;
			inicio.setProximo(null);
			fim = inicio;
		}
		else {
			fim.setProximo(novo);
			fim = novo;
			fim.setProximo(null);
		}
		qtd ++;
	}
	public Object desenfileirar() throws EFilaVazia{
		No controle = inicio;
		if (estaVazia())
			throw new EFilaVazia("A fila está vazia");
		inicio = controle.getProximo();
		qtd--;
		System.out.println("Elemento removido: " + controle.getElemento());
		return controle.getElemento();
	}
	
	public void print(){
	       No atual = inicio;
	       while(atual != null) {
	           System.out.println("Elemento:" + atual.getElemento());
	           atual = atual.getProximo();
	       }
	    }
}
