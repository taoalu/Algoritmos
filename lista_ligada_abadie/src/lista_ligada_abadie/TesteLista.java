package lista_ligada_abadie;

import lista_ligada_abadie.ListaLigada;

public class TesteLista {

    public static void main(String[] args) {
        TesteLista teste = new TesteLista();
        //teste.testaNo();
        teste.testaLista();
    }

    public void testaLista() {
        ListaLigada lista = new ListaLigada();
        lista.inserirNoInicio(3);
        lista.inserirNoInicio(5);
        lista.inserirNoInicio(13);
        lista.imprimeLista();
    }

    public void testaImprimirLista() {
        ListaLigada lista = new ListaLigada();
        lista.imprimeLista();
        lista.inserirNoInicio(3);
        lista.imprimeLista();
    }

    public void testaNo() {
        No no = new No(13);
        No no2 = new No(13, no);
        no2.imprimeDado();
    }

}
