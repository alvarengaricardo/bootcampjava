package edu.alvarenga.contaBanco;

import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        String agencia;
        Integer numero;
        String nomeCliente;
        Float saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.valueOf(scanner.nextLine());

        System.out.print("Por favor, digite nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        saldo = Float.valueOf(scanner.nextLine());


        // TODO: Obter, via Scanner, os valores digitados no terminal

        // TODO: Exibir a mensagem da conta criada

    }
}