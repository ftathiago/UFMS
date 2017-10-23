package br.com.ftathiago.algordenacao;

public class BucketSort {
	public BucketSort(int[] vetor, int tam, int maxVal) {
		/*
		 * Ele precisa saber o maior valor do vetor (maxVal). De posse dessa
		 * informa��o, ele cria um vetor variando de 0 at� maxVal e inicializa
		 * com zeros Depois ele identifica quais o valores existentes no vetor
		 * original, e incrementa, no balde, a determinada posi��o. Quando ele
		 * vai "ordenar" o vetor, ele na verdade o recria, usando as informa��es
		 * do bucket como mapa.
		 */
		// Cria o bucket com um item a mais que o maxVal
		int[] bucket = new int[maxVal + 1];

		// Inicializa com zero
		for (int i = 0; i < maxVal + 1; i++) {
			bucket[i] = 0;
		}
		/*
		 * A ideia do bucket �: Guarda na posi��o i quantas vezes o n�mero x
		 * est� no vetor. A posi��o em si j� � ordenada {0, 1, 2, 3, n}. Se eu
		 * sei o valor m�ximo do vetor e tamb�m sei quantas vezes determinado
		 * n�mero aparece, ent�o eu j� tenho a receita para poder reconstuir o
		 * vetor. Se no vetor original aparecer o n�mero 5 duas vezes, teremos:
		 * bucket[5] = 2 Se no vetor original aparecer o n�mero 7 uma vez,
		 * teremos: bucket[7] = 1 Para os n�meros que n�o est�o no vetor
		 * original e est�o entre 0 e maxVal, temos: bucket[0 -> maxVal] = 0;
		 * 
		 */

		for (int i = 0; i < tam; i++) {
			bucket[vetor[i]]++;
		}

		/*
		 * "pos" controla a posi��o atual do vetor original. "i" controla a
		 * posi��o do bucket e "j" controla o n�mero de ocorr�ncias de um
		 * determinado n�mero, repetindo-o no vetor original
		 */
		int pos = 0;
		for (int i = 0; i < maxVal + 1; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				vetor[pos++] = i;
			}
		}
	}

}
