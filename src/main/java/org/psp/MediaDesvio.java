package org.psp;

public class MediaDesvio {
    ListaEncadeada listaDados;

    public MediaDesvio() {
        this.listaDados = new ListaEncadeada();
    }

    public float calculaMedia(){
        float soma = 0;

        // Caso nao tenha dados na lista retorna -1
        if(this.listaDados.getTamanho() == 0){
            return -1;
        }

        No noAtual = this.listaDados.getCabeca();

        while (noAtual != null){
            soma += noAtual.getDado();
            noAtual = noAtual.getNoProximo();
        }
        return soma/this.listaDados.getTamanho();
    }

    public double calculaDesvioPadrao(){
        float media = this.calculaMedia();

        double somaMediaValor = 0;

        No noAtual = this.listaDados.getCabeca();

        while(noAtual != null){
            somaMediaValor += Math.pow((noAtual.getDado() - media), 2);
            noAtual = noAtual.getNoProximo();
        }

        return Math.sqrt(somaMediaValor/(this.listaDados.getTamanho()-1));
    }
}
