
public class Fila implements IFila{
	private Object fila[]; 
	private int inicio = 0;
	private int fim = 0;
	private int tamanho;
	
	public Fila(int tamanho) {
		fila = new Object[tamanho]; //Criando a fila 
		this.tamanho = tamanho; //Definindo atributo tamanho que é o tamanho total do array
	}
	public int tamanho() {
		return (tamanho - inicio + fim) % tamanho; //Calcula dinamicamente o tamanho ocupado do array
	}
	public boolean estaVazia() {
		return inicio == fim;
	}
	public Object inicio() throws EFilaVazia{
		if (estaVazia()) {
			throw new EFilaVazia("A fila está vazia");
		}
		return fila[inicio]; //Retorna o primeiro elemento da fila
	}
	public void enfileirar(Object elemento) {
		if(tamanho() == tamanho - 1) { //Verifica se a fila está cheia comparando o tamanho total com o tamanho dinamico
			Object novo[];
			novo = new Object[tamanho * 2]; //Cria e duplica o novo array
			int tamanhoNovo = novo.length; //O tamanho do array que foi duplicado
			System.out.println("Tamanho do array: " + tamanhoNovo);
			int i;
			for(i = 0; i < tamanho - 1; i++, inicio++) { //Copia os elementos do array antigo para o novo array 
				novo[i] = fila[inicio % tamanho]; /*O inicio varia conforme remove-se os elementos, portanto a formula pega 
													o elemento q está na posição equivalente ao indice i no array novo */	
			}
			fila = novo;
			inicio = 0;
			fim = i;
			tamanho = tamanhoNovo;
		}
		fila[fim] = elemento;
		fim = (fim + 1) % tamanho;
	}
	public Object desenfileirar() throws EFilaVazia{
		if (estaVazia()) {
			throw new EFilaVazia("A fila está vazia");
		}
		Object aux = fila[inicio];
		fila[inicio] = null;
		inicio = (inicio + 1) % tamanho;
		return aux;
	}
	public void imprimir() {
        for (Object obj : fila) {
            System.out.print(obj + " ");
        }
    }
}
