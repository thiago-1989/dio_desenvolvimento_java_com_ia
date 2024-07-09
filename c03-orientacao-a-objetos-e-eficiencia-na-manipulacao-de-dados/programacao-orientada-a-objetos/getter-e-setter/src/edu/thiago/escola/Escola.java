package edu.thiago.escola;

import edu.thiago.escola.model.Aluno;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        felipe.setSexo("masculino");
        System.out.println("O aluno " + felipe.getNome() + ", é do gênero "+ felipe.getSexo() + " e tem " + felipe.getIdade() + " anos ");
        //RESULTADO NO CONSOLE
        //O aluno Felipe tem 8 anos
    }
}
