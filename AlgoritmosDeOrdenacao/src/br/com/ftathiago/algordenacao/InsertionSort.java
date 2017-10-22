package br.com.ftathiago.algordenacao;

public class InsertionSort {

	public InsertionSort(int[] v, int tam) {
		/*
		 * InsertionSort Consiste, basicamente, em comparar o atual com o
		 * anterior
		 */

		int i;
		// Come�a � partir do segundo item
		for (int j = 1; j < tam; j++) { 
			//guarda o valor que est� sendo comparado
			int x = v[j]; 
			//Varre o vetor para tr�s, trazendo para frente os item que s�o maiores
			for (i = j - 1; i >= 0 && v[i] > x; i--) 
				v[i + 1] = v[i];
			//Quando chega no fim, ele adiciona o valor em julgamento no fim do vetor.
			v[i + 1] = x;
		}
	}
}
