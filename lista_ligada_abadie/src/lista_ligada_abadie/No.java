package lista_ligada_abadie;

/**
 * Esta classe representa um nó de uma lista de inteiros.
 *
 * @author aluno
 */
public class No {

    // o dado que eu quero guardar
    private int dado;

    // a ligação para o próximo nó
    private No proximo;

    public No(int valor) {
        dado = valor;
        proximo = null;
    }

    public No(int valor, No proximoElemento) {
        dado = valor;
        proximo = proximoElemento;
    }

    public void defineProximo(No proximoElemento) {
        proximo = proximoElemento;
    }
    
    public void defineAnterior(No proximoElemento) {
        proximo = proximoElemento;        
    }

    @Override
    public String toString() {
        return dado + "";
    }

    public void imprimeDado() {
        String texto = toString();
        System.out.println(texto);
    }

    public No getProximo() {
        return proximo;
    }

    public int getValor() {
        return dado;
    }

}
