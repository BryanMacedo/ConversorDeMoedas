package domain;

import java.text.DecimalFormat;

public class ConversorRealParaOutra {
    public static double taxaCambio = 0;

    public void realToDollar(ValorReal valorReal){
        taxaCambio = 5.2695;
        double real = valorReal.getMoedaReal();
        double valorDolar = real / taxaCambio;
        DecimalFormat formatoExibicao = new DecimalFormat("#,###");
        valorDolar = Double.valueOf(formatoExibicao.format(valorDolar));
        System.out.println();
        System.out.println("O valor de R$ " + real + " em dolar é USD " + valorDolar);
    }

    public void realToEuro(ValorReal valorReal){
        taxaCambio = 5.5957;
        double real = valorReal.getMoedaReal();
        double valorEuro = real / taxaCambio;
        DecimalFormat formatoExibicao = new DecimalFormat("#,###");
        valorEuro = Double.valueOf(formatoExibicao.format(valorEuro));
        System.out.println();
        System.out.println("O valor de R$ " + real + " em Euro é EUR " + valorEuro);
    }

    public void realToIene(ValorReal valorReal){
        taxaCambio = 0.03391;
        double real = valorReal.getMoedaReal();
        double valorIene = real / taxaCambio;
        DecimalFormat formatoExibicao = new DecimalFormat("#,###");
        valorIene = Double.valueOf(formatoExibicao.format(valorIene));
        System.out.println();
        System.out.println("O valor de R$ " + real + " em Iene é JPY " + valorIene);
    }

    public void realToCanadence(ValorReal valorReal){
        taxaCambio = 3.8075;
        double real = valorReal.getMoedaReal();
        double valorCanadence = real / taxaCambio;
        DecimalFormat formatoExibicao = new DecimalFormat("#,###");
        valorCanadence = Double.valueOf(formatoExibicao.format(valorCanadence));
        System.out.println();
        System.out.println("O valor de R$ " + real + " em Dolar Canadence é CAD " + valorCanadence);
    }

    public void realToYuan(ValorReal valorReal){
        taxaCambio = 0.7231;
        double real = valorReal.getMoedaReal();
        double valorYuan = real / taxaCambio;
        DecimalFormat formatoExibicao = new DecimalFormat("#,###");
        valorYuan = Double.valueOf(formatoExibicao.format(valorYuan));
        System.out.println();
        System.out.println("O valor de R$ " + real + " em Yuan Chineses é CNY " + valorYuan);
    }
}
