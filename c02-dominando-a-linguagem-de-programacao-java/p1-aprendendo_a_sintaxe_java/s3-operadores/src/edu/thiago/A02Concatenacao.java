package edu.thiago;

public class A02Concatenacao {
    public static void main(String[] args) throws Exception {
        String a = "Linguagem";
        String b = "Java";
        System.out.println(a + " " + b);

        String concatenacao ="?"; 
        System.out.println(concatenacao); // ?

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao); // 31

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao); // 1111

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao); // 1111

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao); // 1111

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao); // 13

    }
}
