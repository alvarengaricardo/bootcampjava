package edu.alvarenga.condicional;

public class CondicionalTernaria {
    public static void main(String[] args) throws Exception {
        float notaAluno = 4.0F;
        String resultado;

        resultado = notaAluno >= 7 ? "Aprovado!" : notaAluno >= 5 && notaAluno < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
