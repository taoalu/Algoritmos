package exercicios_algoritmos;

public class FuncoesLista {

    int remover(int[] array, int posicao) {
        int valorRemovido = array[posicao];
        array[posicao] = 0;
        return valorRemovido;
    }

    boolean inserirEmQualquerPosicao(int[] array, int posicao, int valor) {
        if (posicao >= 0 && posicao < array.length) {
            array[posicao] = valor;
            return true;
        } else {
            System.out.println("Não é possível inserir!");
        }
        return false;
    }

    int removerDoInicio(int[] array) {
        int valorRemovido = array[0];
        remover(array, 0);
        return valorRemovido;
    }

    boolean inserirNoInicio(int[] array, int valor) {
        inserirEmQualquerPosicao(array, 0, valor);
        int aux;
        for (int i = 0; i < array.length; i++) {
            aux = array[i];
            array[i] = aux;
        }
        array[0] = valor;
        return true;
    }

    void imprimirLista(int[] array) {
        if (array.length == 0) {
            System.out.println("Array vazio!");
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != 0) {
                    System.out.print(array[i] + " ");
                }
            }
            System.out.println("");
            //Testando
        }
    }
}
