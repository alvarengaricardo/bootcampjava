package dc_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RegistroTransacoesComStream {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o saldo inicial da conta
        //System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Lê a quantidade total de transações
        //System.out.print("Digite a quantidade de transações: ");
        int quantidadeTransacoes = scanner.nextInt();

        // Lista para armazenar as transações
        List<Transacao> transacoes = new ArrayList<>();

        // Loop para iterar sobre as transações
        for (int i = 1; i <= quantidadeTransacoes; i++) {
            // Lê o tipo de transação
            //System.out.print("Digite o tipo de transação (D para depósito, S para saque): ");
            char tipoTransacao = scanner.next().toUpperCase().charAt(0);

            // Lê o valor da transação
            //System.out.print("Digite o valor da transação: ");
            double valorTransacao = scanner.nextDouble();

            // Cria uma nova transação e adiciona à lista de transações
            Transacao transacao = new Transacao(tipoTransacao, valorTransacao);
            transacoes.add(transacao);

            // Verifica e atualiza o saldo da conta com base no tipo de transação
            if (transacao.getTipo() == 'D') {
                saldo += valorTransacao;
            } else if (transacao.getTipo() == 'S') {
                saldo -= valorTransacao;
            } else {
                //System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--; // Decrementa o índice para repetir a iteração
                transacoes.remove(transacao); // Remove a transação inválida da lista
            }
        }

        // Exibir o saldo final
        System.out.print("Saldo : " + saldo);

        // Exibir a lista de transações utilizando Stream API
        System.out.println("\nTransacoes:");
        transacoes.stream()
                .map(transacao -> (transacao.getTipo() == 'D' ? "d de " : "s de ") + transacao.getValor())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class Transacao {
    private char tipo;
    private double valor;

    public Transacao(char tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public char getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}

