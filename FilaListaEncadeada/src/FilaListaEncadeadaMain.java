
public class FilaListaEncadeadaMain {

	public static void main(String args[]) throws EFilaVazia{
		FilaListaEncadeada fila = new FilaListaEncadeada();
		fila.enfileirar(20);
		fila.enfileirar(02);
		fila.enfileirar(15);
		fila.enfileirar(26);
		fila.desenfileirar();
		System.out.println(fila.estaVazia() ? "A fila está vazia" : "A fila não está vazia");
		System.out.println("Total Elementos: " + fila.tamanho());
		System.out.println("Ínicio: " + fila.inicio.getElemento());
		System.out.println("Fim: " + fila.fim.getElemento());
		fila.print();
	}

}
