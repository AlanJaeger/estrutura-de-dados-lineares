public class Sequencia{
	private int inicio;
	private int fim;
	private int tamanho;
	private Elemento[] elementos;

	public Sequencia(){
		inicio = 0;
		fim = 0;
		tamanho = 0;
		elementos = new Elemento[2];
	}

	public void inserirInicio(Object o){
		Elemento novo = new Elemento(o);
		if(tamanho == elementos.length) {
			aumentar();
		}
		elementos[inicio] = novo;
		tamanho++;
		inicio--;
		if(inicio < 0){
			inicio = elementos.length - 1;
		}
	}

	public void removerInicio(){
		if (tamanho != 0) {
			tamanho--;
			inicio = (inicio + 1) % elementos.length;
		}
	}


	public void aumentar(){
		Elemento[] aux = new Elemento[elementos.length*2];
		for (int i = 0;i < elementos.length ;i++) {
		 	inicio = (inicio + 1) % elementos.length;
		 	aux[i] = elementos[inicio];
		 }
		 inicio = aux.length - 1;
		 fim = tamanho;
		 elementos = aux; 
	}

	public void inserirFim(Object o){
		Elemento novo = new Elemento(o);
		if(tamanho == elementos.length) {
			aumentar();
		}
		elementos[fim] = novo;
		tamanho++;
		fim = (fim + 1) % elementos.length;
	}


	public void removerFim(){
		if(tamanho != 0){
			tamanho--;
			fim = (fim + 1) % elementos.length;
		}
	}

	public void imprimir(){
		int aux = (inicio + 1) % elementos.length;
		while (aux != fim){
			System.out.println(elementos[aux].getValor());
			aux = (aux + 1) % elementos.length;
		}
	}

	public int getInicio(){
		return (inicio + 1) % elementos.length;
	}

	public int getTamanho(){
		return tamanho;
	}

	public Elemento[] getElementos(){
		return elementos;
	}


}