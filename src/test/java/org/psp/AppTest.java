package org.psp;


import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    /*
     * Testes para a coluna "Tamanho estimado do proxy"
     */
    public void testeMediaProxy(){

        // Criando a lista
        MediaDesvio mediaDesvio = new MediaDesvio();


        // Criando os nós
        float dados[] = {160,591,114,229,230,270,128,1657,624,1503};

        for(float dado:dados){
            No novoNo = new No(dado);
            mediaDesvio.listaDados.adicionaFim(novoNo);
        }

        assertEquals(550.6, mediaDesvio.calculaMedia(), 0.1);
        assertEquals(572.03, mediaDesvio.calculaDesvioPadrao(), 0.1);

    }

    /*
     * Testes para a coluna "Tamanho estimado do proxy"
     */
    public void testeMediaHorasDesenvolvimento(){

        // Criando a lista
        MediaDesvio mediaDesvio = new MediaDesvio();


        // Criando os nós
        float dados[] = {15.0f,69.9f,6.5f,22.4f,28.4f,65.9f,19.4f,198.7f,38.8f,138.2f};

        for(float dado:dados){
            No novoNo = new No(dado);
            mediaDesvio.listaDados.adicionaFim(novoNo);
        }

        assertEquals(60.32, mediaDesvio.calculaMedia(), 1);
        assertEquals(62.26, mediaDesvio.calculaDesvioPadrao(), 1);

    }
}
