package dc_02.cofre;

import java.util.Scanner;

abstract class Cofre {
    protected String tipo;
    protected String metodoAbertura;

    public Cofre(String tipo, String metodoAbertura) {
        this.tipo = tipo;
        this.metodoAbertura = metodoAbertura;
    }

    public void imprimirInformacoes() {
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Metodo de abertura: " + this.metodoAbertura);
    }
}

class CofreDigital extends Cofre {
    private int senha;

    public CofreDigital(int senha) {
        super("Cofre Digital", "Senha");
        this.senha = senha;
    }

    public boolean validarSenha(int confirmacaoSenha) {
        return confirmacaoSenha == this.senha;
    }
}

class CofreFisico extends Cofre {
    public CofreFisico() {
        super("Cofre Fisico", "Chave");
    }
}

class Desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o tipo de cofre (primeira linha da entrada)
        String tipoCofre = scanner.nextLine();

        if (tipoCofre.equalsIgnoreCase("digital")) {
            // Lê a senha do cofre
            int senha = scanner.nextInt();
            // Lê a confirmação da senha do cofre
            int confirmacaoSenha = scanner.nextInt();

            // Cria o cofre digital e exibe as informações
            CofreDigital cofreDigital = new CofreDigital(senha);
            cofreDigital.imprimirInformacoes();

            // Valida a senha e exibe a mensagem adequada
            if (cofreDigital.validarSenha(confirmacaoSenha)) {
                System.out.println("Cofre aberto!");
            } else {
                System.out.println("Senha incorreta!");
            }
        } else if (tipoCofre.equalsIgnoreCase("fisico")) {
            // Cria o cofre físico e exibe as informações
            CofreFisico cofreFisico = new CofreFisico();
            cofreFisico.imprimirInformacoes();
            //System.out.println("Cofre aberto!");
        } else {
            // Tipo de cofre inválido
            System.out.println("Tipo de cofre inválido!");
        }

        scanner.close();
    }
}
