import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Por favor, digite sua idade:");
        int idade = scanner.nextInt();

        // Verificar se a idade do cliente é >= 18
        if (idade >= 18) {
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        } else {
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
