package exercicios_algoritmos;

public class TesteFuncoes {

    public static void main(String[] args) {
        //Testando o GitHub
        FuncoesLista m = new FuncoesLista();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int inseridos = array.length - 1;
        
        System.out.println("Array Original!");
        m.imprimirLista(array);       
        System.out.println("Valor removido do final: " + m.remover(array, inseridos));
        m.imprimirLista(array);
        System.out.println("Valor removido do incício: " + m.removerDoInicio(array));
        m.imprimirLista(array);
         System.out.println("Valor inserido em qualquer posição");
        m.inserirEmQualquerPosicao(array, 4, 333);
        m.imprimirLista(array);
        System.out.println("Valor inserido no início");
        m.inserirNoInicio(array, 333);
        m.imprimirLista(array);
    }
}
