package edu.alvarenga.condicional;

public class CondicionalSwitchCase {
    public static void main(String[] args) throws Exception {
        String sigla = "GG";

        switch(sigla){
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            case "GG":{
                System.out.println("Extra Grande");
                break;
            }
            default:
                System.out.println("Não definido.");
        }
    }
}
