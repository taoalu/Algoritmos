package buscabinaria;

public class BuscaBinaria {

    public static void main(String[] args) {
        int[] v = new int[100000000];

        for (int i = 0; i < v.length; i++) {
            v[i] = i + 1;
        }
        System.out.println("O valor está na posição: " + buscaBinaria(10, v.length, v));
        System.out.println("O valor está na posição: " + buscaSequencial(90879, v));
    }

    public static int buscaBinaria(int valorProcurado, int tamanhoDoVetor, int vetor[]) {
        int esquerda, meio, direita;
        esquerda = 0;
        direita = tamanhoDoVetor - 1;

        while (esquerda <= direita) {
            meio = (esquerda + direita) / 2;
            if (vetor[meio] == valorProcurado) {
                return meio;
            }
            if (vetor[meio] < valorProcurado) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -1;
    }

    public static int buscaSequencial(int valor, int[] vetor) {
        int encontrado = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                encontrado = i;
                break;
            } else {
                encontrado = -1;
            }
        }
        return encontrado;
    }
}
