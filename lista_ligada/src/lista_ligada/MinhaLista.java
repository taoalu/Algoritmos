package lista_ligada;

public class MinhaLista {

    int qtdElementos;
    No primeiro, ultimo;

    //Inicilar vazia
    public MinhaLista() {
        this.qtdElementos = 0;
        this.primeiro = null;
        this.ultimo = primeiro;
    }

    public void inserirNoComeco(int numero) {
        if (this.qtdElementos == 0) {
            No no = new No();
            no.setNumero(numero);
            no.setProximo(primeiro);
            this.primeiro = no;
        } else {
            No no2 = new No();
            no2.setNumero(numero);
            no2.setProximo(primeiro);
            primeiro = no2;
        }
        this.qtdElementos++;
    }

    public void inserirNoFinal(int numero) {
        No no = new No();
        no.setNumero(numero);
        if (this.qtdElementos == 0) {
            this.primeiro = no;
            this.ultimo = primeiro;
        } else {
            ultimo.setProximo(no);
            ultimo = no;
        }
        this.qtdElementos++;
    }

    public void imprimir() {
        if (qtdElementos == 0) {
            System.out.println("Lista Vazia!");
        } else {
            No aux = this.primeiro;
            System.out.print("[");
            for (int i = 0; i < this.qtdElementos - 1; i++) {
                System.out.print(aux.getNumero() + ",");
                aux = aux.getProximo();
            }
            System.out.println(aux.getNumero() + "]");
        }
    }
}
