package lista_pilha_fila;

public class Lista_pilha_fila {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int inicio = 0;
        int fim = -1;
        int valor = 10;

        for (int i = 0; i < vetor.length; i++) {
            fim = FilaInserir(vetor, inicio, fim, valor);
            vetor[i] = valor;
            valor++;
        }

        inicio = FilaRemover(vetor, inicio);
        System.out.println("Valor inicio: " + inicio);

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("" + vetor[i]);
        }
    }

    public static int FilaInserir(int[] v, int inicio, int fim, int valor) {
        fim = fim + 1;
        v[fim] = valor;
        return fim;
    }

    public static int FilaRemover(int[] v, int inicio) {
        v[inicio] = -1;
        inicio = inicio + 1;
        return inicio;
    }
}
