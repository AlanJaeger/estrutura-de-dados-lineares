public class SequenciaMain {
	public static void main(String args[]) {
		Sequencia seq = new Sequencia();
		seq.inserirInicio("1");
		seq.inserirInicio("2");
		seq.inserirInicio("3");
		seq.inserirFim("4");
		seq.inserirFim("5");
		seq.removerInicio();
		seq.removerFim();

		int inicio = seq.getInicio();
		int tamanho = seq.getTamanho();
		Elemento[] elementos = seq.getElementos();
		for(int i = 0; i < tamanho; i++){
			System.out.println((String)elementos[inicio].getValor());
			inicio = (inicio + 1) % elementos.length;
		}

	}
}