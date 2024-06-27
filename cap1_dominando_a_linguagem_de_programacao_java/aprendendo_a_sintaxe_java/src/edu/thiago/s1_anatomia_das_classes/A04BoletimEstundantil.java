package edu.thiago.s1_anatomia_das_classes;
public class A04BoletimEstundantil {
    public static void main(String[] args) {
    // SEM INDENTAÇÃO
        int media = 6;
        if (media < 6) 
        System.out.println("REPROVADO");            
        else if (media == 6)
        System.out.println("PROVA MINERVA");
        else
        System.out.println("APROVADO");   
    ////////////////////////////////////////////////////
    // COM INDENTAÇAO      
        media = 9;
        if (media < 6) 
            System.out.println("REPROVADO");            
        else if (media == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO");         
        
    }
}
