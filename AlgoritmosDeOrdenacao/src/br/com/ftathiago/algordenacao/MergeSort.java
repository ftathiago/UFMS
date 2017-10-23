package br.com.ftathiago.algordenacao;

public class MergeSort {
	public MergeSort(int[] vetor, int inicio, int fim) {
		int meio;

		if (inicio < fim) {
			// Procura dividir o vetor ao meio
			meio = (inicio + fim) / 2;
			// organiza a metade � esquerda do vetor
			new MergeSort(vetor, inicio, meio);
			// organiza a metade � direita do vetor
			new MergeSort(vetor, meio + 1, fim);
			// junta tudo num vetor s�
			merge(vetor, inicio, meio, fim);
		}
	}

	private void merge(int[] vetor, int inicio, int meio, int fim) {
		int i, j, k;
		int aux[] = new int[fim + 1];
		// inicializa o vetor aux com os mesmos dados de vetor
		for (i = inicio; i <= fim; i++) {
			aux[i] = vetor[i];
		}

		i = inicio; // percorre o auxiliar at� o meio
		j = meio + 1; // percorre o auxiliar at� o fim (partindo do meio)
		k = inicio; // percorre o original do in�cio ao fim.

		while ((i <= meio) && (j <= fim)) {
			/*
			 * K vai percorrendo o vetor item � item. Assim, conforme � feita a
			 * verifica��o entre direta e esquerda do vetor, sempre K vai sendo
			 * incrementado. Assim eu consigo ordenar o vetor final, garantindo
			 * que a parte menor sempre ficar� � esquerda.
			 * 
			 */
			if (aux[i] < aux[j]) {
				vetor[k] = aux[i];
				i++;
			//} else if (aux[i] > aux[j]) {//Algoritmo instavel
			} else if (aux[i] > aux[j]) {//Algor�tmo est�vel				
				vetor[k] = aux[j];
				j++;
			}
			k++;
		}
		/*
		 * Se no final das opera��es, o valor de i ainda ficou menor que o meio
		 * do vetor, a caminhada de i � completada, garantindo que os valores
		 * ser�o sobrepostos corretamente
		 */

		while (i <= meio) {
			vetor[k] = aux[i];
			i++;
			k++;
		}

	}
}
