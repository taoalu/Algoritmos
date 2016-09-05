package exercicios_algoritmos;

public class TesteFuncoes {
    public static void main(String[] args) {
    //Testando o GitHub
        FuncoesLista m = new FuncoesLista();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int inseridos = array.length - 1;
        
        m.imprimirLista(array);
        m.inserirNoInicio(array, 10);
        m.imprimirLista(array);
        System.out.println("Valor removido: " + m.remover(array, inseridos));
        m.imprimirLista(array);
        m.imprimirLista(array);
        int x = 10;
    }
}
