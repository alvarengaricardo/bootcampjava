package edu.alvarenga.condicional;

public class CondicionalEncadeada {
    // condicional encadeada
    public static void main(String[] args) throws Exception {
        float notaAluno = 4.0F;

        if (notaAluno >= 7)
            System.out.println("Aprovado!");
        else if (notaAluno >= 5 & notaAluno < 7)
            System.out.println("Recuperação.");
        else
            System.out.println("Reprovado.");
    }
}
