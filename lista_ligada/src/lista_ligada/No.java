package lista_ligada;

public class No {

    private int numero;
    No proximo;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public int getNumero() {
        return numero;
    }

    public No getProximo() {
        return proximo;
    }

}
