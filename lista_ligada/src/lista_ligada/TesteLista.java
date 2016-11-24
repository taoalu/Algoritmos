package lista_ligada;

public class TesteLista {

    public static void main(String[] args) {
        MinhaLista lista = new MinhaLista();

        for (int i = 1; i < 10; i++) {
            lista.inserirNoFinal(i);
        }
        lista.imprimir();        
    }
}
