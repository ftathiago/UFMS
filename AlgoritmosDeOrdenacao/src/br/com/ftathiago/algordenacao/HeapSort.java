package br.com.ftathiago.algordenacao;

public class HeapSort {
	/*
	 * Todo o lance do Heap est� no padr�o matem�tico estabelecido por ele. O
	 * pai de qqr n� (ou posi��o do vetor) sempre ser�: (posi��o -1) / 2 Se voc�
	 * tem o pai, voc� tem como descobrir os dois filhos. Da direita: 2 *
	 * posi��o + 2; Da esquerda: 2 * posi��o + 1; Apenas preste aten��o para que
	 * a condi��o de exist�ncia dos filhos seja considerada. Ou seja: esquerda e
	 * direita N�O PODEM SER MAIOR do que o tamanho do array que est� sendo
	 * considerado.
	 */
	public HeapSort(int vetor[], int tam) {
		/*
		 * Varre o array do fim para o in�cio.
		 */
		for (int i = tam - 1; i >= 0; i--) {
			/*
			 * Organiza o array, criando a pilha. Note que, a cada itera��o, i �
			 * diminu�do. Desta forma, estou falando para a pilha que o meu
			 * array est� diminuindo, ou ainda que eu desejo que ela considere
			 * um intervalo menor. Isto porque, a cada itera��o, estou colocando
			 * o maior n�mero no final do array. Assim, n�o preciso calcular
			 * tudo de novo. E veja: este � o motivo pelo qual � preciso avaliar
			 * a condi��o de exist�ncia do n�.
			 */
			heap(vetor, i);
			int tmp = vetor[0];
			vetor[0] = vetor[i];
			vetor[i] = tmp;

		}
	}

	private void heap(int[] vetor, int tam) {
		// Aqui encontro o n� pai
		for (int i = ((tam - 1) / 2); i >= 0; i--) {
			organizaNo(vetor, i, tam);
			tam--;
		}
	}

	private void organizaNo(int[] vetor, int i, int tam) {
		// Aqui eu encontro os filhos, de acordo com o n� pai.
		int posMaior = i;
		int esq = 2 * i + 1;
		int dir = 2 * i + 2;
		/*
		 * Verifica a condi��o de exist�ncia de esq e direita � importante que a
		 * condi��o de exist�ncia seja uma opera��o matem�tica e n�o v[dir] !=
		 * null. v[dir] n�o ser� null quando dir >=0 e dir < metade do array.
		 * Por isso � importante fazer as contas abaixo nos if's
		 */

		if (esq <= tam) {
			// Al�m da condi��o de exist�ncia, j� vejo qual o n� filho que �
			// maior
			if ((dir <= tam) && (vetor[esq] < vetor[dir])) {
				posMaior = dir;
			} else {
				posMaior = esq;
			}
		}
		if ((posMaior != i) && (vetor[posMaior] > vetor[i])) {
			int tmp = vetor[i];
			vetor[i] = vetor[posMaior];
			vetor[posMaior] = tmp;
		}
	}
}