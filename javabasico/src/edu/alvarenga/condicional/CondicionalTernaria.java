package edu.alvarenga.condicional;

public class CondicionalTernaria {
    public static void main(String[] args) throws Exception {
        float notaAluno = 7.0F;
        String resultado;

        resultado = notaAluno >= 7 ? "Aprovado!" : "Recuperação";
        resultado = notaAluno < 5 ? "Reprovado" : resultado;
        System.out.println(resultado);
    }
}
