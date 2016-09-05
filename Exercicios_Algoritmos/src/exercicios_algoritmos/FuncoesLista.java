package exercicios_algoritmos;
public class FuncoesLista {

    int remover(int[] array, int fimDoArray) {
        int valorRemovido = array[fimDoArray];
        array[fimDoArray] = 0;
        return valorRemovido;
    }

    boolean inserirNoInicio(int[] array, int valor) {
        if (array.length == 0) {
            return false;
        } else {
            int aux;
            for (int i = 0; i < array.length; i++) {
                aux = array[i];
                array[i] = aux;
            }
            array[0] = valor;
            return true;
        }
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
