
public class FilaListaEncadeadaMain {

	public static void main(String args[]) throws EFilaVazia{
		FilaListaEncadeada fila = new FilaListaEncadeada();
		fila.enfileirar(20);
		fila.enfileirar(02);
		fila.enfileirar(15);
		fila.enfileirar(26);
		fila.desenfileirar();
		System.out.println(fila.estaVazia() ? "A fila est� vazia" : "A fila n�o est� vazia");
		System.out.println("Total Elementos: " + fila.tamanho());
		System.out.println("�nicio: " + fila.inicio.getElemento());
		System.out.println("Fim: " + fila.fim.getElemento());
		fila.print();
	}

}
