package bubblesort;

public class BubbleSort {

    public static void main(String[] args) {
        /*int[] vetor = {2, 5, 6, 1, 9, 10, 8, 7, 3, 4};
        System.out.print("Vetor original: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
        System.out.print("Vetor ordenado: ");
        BubbleSort(vetor);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");*/

        int[] e = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] s = new int[e.length];
        int menor;

        for (int i = 0; i < e.length; i++) {
            if (i > i + 1) {
                s[0] = menor = i;
                s[i]++;
            }
        }
    }

    public static int[] BubbleSort(int[] vetor) {
        int[] v = new int[vetor.length];
        int j, i, aux;
        for (i = 0; i < vetor.length; i++) {
            for (j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        return v;
    }

    public static void OrdenacaoSelecao(int[] entrada) {

    }
}
