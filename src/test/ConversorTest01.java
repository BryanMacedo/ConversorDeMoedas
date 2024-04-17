package test;

import domain.ConversorRealParaOutra;
import domain.ValorReal;

import java.util.Scanner;

public class ConversorTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ValorReal valorReal = new ValorReal();
        ConversorRealParaOutra conversor = new ConversorRealParaOutra();

        char continuarConversao = 'S';

        while (continuarConversao == 'S'){
            System.out.println("Insira um valor em Real: ");
            System.out.print("R$ ");
            valorReal.setMoedaReal(input.nextDouble());
            System.out.println();

            System.out.println("Digite para qual moeda deseja converter:");
            System.out.println("Opções: 1-Dolar / 2-Yuan Chineses / 3-Euro / 4-Iene / 5-Dolar Canadence");
            input.nextLine();
            String converterPara = input.nextLine();

            switch (converterPara){
                case "1" -> { //DOLAR
                    conversor.realToDollar(valorReal);
                }
                case "2" -> { //YUAN CHINESES
                    conversor.realToYuan(valorReal);
                }
                case "3" ->{ //EURO
                    conversor.realToEuro(valorReal);
                }
                case "4" -> { // IENE
                    conversor.realToIene(valorReal);
                }
                case "5" -> { //DOLAR CANADENCE
                    conversor.realToCanadence(valorReal);
                }
                default ->  System.out.println("Operação invalida!!");
            }

            System.out.println();
            System.out.println("Deseja continuar convertendo? ");
            continuarConversao = input.next().charAt(0);
            System.out.println();
        }

        System.out.println("Programa finalizado!!");

        /*
        * Com este mini projeto pude aprender como se formata um double utilizando o Decimalformat*/
    }
}