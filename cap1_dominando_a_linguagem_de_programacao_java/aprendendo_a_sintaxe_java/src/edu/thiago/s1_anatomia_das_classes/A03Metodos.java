package edu.thiago.s1_anatomia_das_classes;

public class A03Metodos {
    public static void main(String[] args) {
       /*
       TipoRetorno NomeObjetivoNoInfinitivo ParâmentrosEntre()
        * int somar(int numero1, int número2);
        * ^^^  ^^^                   ^^^
        TipRe  NomeObInf             Param
        tipo retorno
        */

        // String 
        String name = "Thiago";
        String lastName = "Oliveira";
    //  System.out.println(nomeCompleto (name, lastName));  ou,
        String fullName = nomeCompleto(name, lastName);
        System.out.println(fullName);

    }

    public static String nomeCompleto (String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    //  return nome + " " + sobrenome;
    }
}
 