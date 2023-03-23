package org.psp;

public class ListaEncadeada {
    private No cabeca;
    private No cauda;

    public ListaEncadeada(No cabeca, No cauda) {
        this.cabeca = cabeca;
        this.cauda = cauda;
    }

    public ListaEncadeada() {
        this.cabeca = null;
        this.cauda = null;
    }

    public boolean adicionaFim(No no){
        if (cabeca == null){
            cabeca = no;
        } else{
            this.cauda.setNoProximo(no);
            no.setNoProximo(null);
        }
        cauda = no;
        return true;
    }

    public void imprimeLista(){
        No no = this.cabeca;
        while (no != null){
            System.out.println(no.getDado());
            no = no.getNoProximo();
        }
    }

}
