package dc_02.mainContaBancaria;

import java.util.Scanner;


public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria uma nova conta bancária com o saldo inicial
        System.out.println("Informe o saldo inicial da conta:");
        double saldoInicial = scanner.nextDouble();
        dc_02.mainContaBancaria.ContaBancaria conta = new dc_02.mainContaBancaria.ContaBancaria(saldoInicial);

        // Lê a entrada com o valor do depósito e aciona o método "depositar"
        System.out.println("Informe o valor do depósito:");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a entrada com o valor do saque e aciona o método "sacar"
        System.out.println("Informe o valor do saque:");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

