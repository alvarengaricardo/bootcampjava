package edu.alvarenga.condicional;

public class CondicionalSimples {
    // condicional simples
    public static void main(String[] args) throws Exception {
        double saldo = 25.0;
        double valorSolicitado = 25.1;

        if (valorSolicitado <= saldo) saldo = saldo - valorSolicitado;

        System.out.println(saldo);

    }
}
