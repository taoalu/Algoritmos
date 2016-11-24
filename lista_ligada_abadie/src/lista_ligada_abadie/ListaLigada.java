package lista_ligada_abadie;

public class ListaLigada {

    private No cabecaDaLista;
//	private int tamanho;

    public ListaLigada() {
        // mesmo sendo redundante, é bom pra lembrar
        cabecaDaLista = null;
//		tamanho = 0;
    }

    public boolean estaVazia() {
        boolean resultado;

        resultado = (cabecaDaLista == null);

        return resultado;
    }

    public void inserirNoInicio(int valor) {
        // cria o novo nó e preenche ele
        No novoNo = new No(valor);

        // interliga na lista, no começo
        if (estaVazia()) {
            // está vazia: guarde a referência.
            this.cabecaDaLista = novoNo;
        } else {
            // não está vazia: ajuste as referências
            // com cuiado pra não perder o próximo.
            novoNo.defineProximo(cabecaDaLista);
            cabecaDaLista = novoNo;
        }
    }

    public void imprimeLista() {
        No referencia;
        // se estiver vazia (cabeça == null)
        // imprime: lista vazia
        //if(estaVazia() == true)
        if (estaVazia()) {
            System.out.println("Lista vazia.");
        } // senão
        else {
            //System.out.println("Falta implementar.");
            // aqui eu sei que a lista não está vazia
            // ref aponte pra o início
            No auxiliar = cabecaDaLista;

            // percorre a lista num laço
            // enquanto (não achei o fim da lista)
            // enquanto (ref != null)
            while (auxiliar.getProximo() != null) {
                // aponta pro nó e manda ele se imprimir
                // anda com a referência: ref = no.proximo()
            }
        }

    }

    public void inserirNoFinal(int valor) {
        // testar se está vazia
        // se sim:
        // pego o nó e insiro no final.
    }

    public int removerNoInicio() {
        // testar se tem algo
        // se sim: retorna o dado e remove o nó
        // se não: temos um problema.
        return 0;
    }

    public int removerNoFinal() {
        // testar se tem algo
        // se sim: retorna o dado e remove o nó
        // se não: temos um problema.
        return 0;
    }

}
