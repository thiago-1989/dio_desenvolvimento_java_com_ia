package edu.thiago.main.java.set.Ordenacao;

import java.util.Set;
import java.util.TreeSet;

public class GerAlunos {
    //Atributos
    Set<Aluno> alunosSet = new TreeSet<>();

    public GerAlunos() {
        this.alunosSet = new TreeSet<>();
    }

    public void adicionarAluno(String nome,long matricula, double media) {
        this.alunosSet.add(new Aluno(nome, matricula, media));
    }

    public static void main(String[] args) {
        GerAlunos classe = new GerAlunos();
        classe.adicionarAluno("Joao", 23, 7.5);

        System.out.println(classe.alunosSet);
    }
}

