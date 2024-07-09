public class ForEach {
    public static void main(String[] args) {
        String [] alunos = {"Thiago", "Wellington", "Maxuele", "Alex", "Marinalva"};
        int i = 1;
        for (String aluno: alunos) {
            System.out.println("Aluno " + i + ": " + aluno);
            i++;
        }
    }
}
