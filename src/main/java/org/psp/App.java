package org.psp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MediaDesvio mediaDesvio = new MediaDesvio();

        Scanner scanner = new Scanner(System.in);

        boolean dados = true;
        while (dados){
            float dado;
            try {
                System.out.println("Digite um número ou SAIR para terminar a lista:");
                dado = scanner.nextFloat();
                No novoNo = new No(dado);
                mediaDesvio.listaDados.adicionaFim(novoNo);
            } catch (InputMismatchException e){
                dados = false;
            }
        }


        System.out.println("O valor da média é: " + mediaDesvio.calculaMedia());
        System.out.println("O valor do desvio padrão é: " + mediaDesvio.calculaDesvioPadrao());

    }
}
