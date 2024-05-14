package anatomiaClasses;

public class MinhaClasse {
    public static void main(String[] args) {

        final String BR = "Brasil"; // Define uma constante BR de balor "Brasil"
        int valor_$1 = 100;
        int valor_$2;
        int idade = 23;
        double altura = 1.68;
        String nome;
        boolean flag;
        String primeiroNome = "João";
        String segundoNome = "Silva";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        valor_$2 = somar(valor_$1, 50);

        System.out.println("Primeira Classe!");
        System.out.println(valor_$2);
        System.out.println(nomeCompleto);


    }

    static int somar(int a, int b) {
        return a + b;
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
