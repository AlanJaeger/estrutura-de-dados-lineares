
public class FilaMain {

	public static void main(String[] args) throws EFilaVazia{
		int qtd = 1;
		Fila fila = new Fila(qtd);
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		fila.enfileirar(5);
		fila.enfileirar(6);
		fila.desenfileirar();
		System.out.println("Total de elementos: " + fila.tamanho());
		fila.imprimir();
	}

}
