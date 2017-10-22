
public class SelectionSort {
	/*
	 * SelectionSort
	 * Varre o inteiro em busca do menor elemento, guardando a posi��o dele em uma vari�vel
	 * Quando termina a varredura, troca a posi��o do menor com o in�cio do vetor.
	 * 
	 */
	public SelectionSort(int[] vetor) {
		for (int i = 0; i < vetor.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < vetor.length; j++) {
				if (vetor[j] < vetor[min]) {
					min = j;
				}
			}
			int aux = vetor[min];
			vetor[min] = vetor[i];
			vetor[i] = aux;
		}
	}
}
