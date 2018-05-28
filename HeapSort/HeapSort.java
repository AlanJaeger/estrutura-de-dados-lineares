public class HeapSort{
    public static void main(String[] args) {
		int[] Lista = {9, 5, 88, 76, 44, 18, 0, 11, 21};
		System.out.print("Lista antes: ");

		for (int i : Lista) {
                    System.out.print(i + " ");
		}

		System.out.println();

		ordenar(Lista);

		System.out.print("Lista depois: ");
		for (int i : Lista) {
			System.out.print(i + " ");
		}
    }
    
    public static void ordenar(int[] Lista){
		
		//Montagem da árvore.

		montarArvoreHeap(Lista);
		
		int n = Lista.length;

		//Para uma árvore de tamanho n, ordene-a n-1 vezes.

		for (int i = Lista.length -1; i > 0; i--) {
			int aux = Lista[i];
			Lista[i] = Lista[0];
			Lista[0] = aux;
			ordenarArvore(Lista, 0, --n);
		}
	}

	public static void montarArvoreHeap(int[] Lista){
		for (int posicao = (Lista.length - 1) /2; posicao >= 0; posicao--){
			ordenarArvore(Lista, posicao, Lista.length);
		}
	}

	public static void ordenarArvore(int[] Lista, int posicao, int tamanhoVetor){
		int indiceFilho1 = 2 * posicao + 1;
		int indiceFilho2 = indiceFilho1 + 1;

		if (indiceFilho1 < tamanhoVetor) {
			
			if (indiceFilho2 < tamanhoVetor) {
				
				//Se ainda estivermos dentro do vetor, teste qual o maior filho.
			
				if (Lista[indiceFilho1] < Lista[indiceFilho2]){
					indiceFilho1 = indiceFilho2;
				}
			}
		
			//Comparação do filho 1 com o nó pai.

			if (Lista[indiceFilho1] > Lista[posicao]) {
				int aux = Lista[indiceFilho1];
				Lista[indiceFilho1] = Lista[posicao];
				Lista[posicao] = aux;

				//Remontagem da árvore.
				
				ordenarArvore(Lista, indiceFilho1, tamanhoVetor);	
			}
		}
	}
}