package dc_01;

import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o saldo atual da conta bancaria:");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, informe o valor do saque desejado:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // Transação realizada com sucesso
            System.out.println("Transacao realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial
            double saldoComChequeEspecial = saldo + limiteChequeEspecial;
            if (saque <= saldoComChequeEspecial) {
                // Transação realizada com sucesso utilizando o cheque especial
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                // Transação não realizada. Limite do cheque especial excedido
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
