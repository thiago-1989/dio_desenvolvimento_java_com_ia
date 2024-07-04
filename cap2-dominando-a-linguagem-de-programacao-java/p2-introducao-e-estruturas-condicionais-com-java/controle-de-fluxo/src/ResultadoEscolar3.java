public class ResultadoEscolar3 {
    public static void main(String[] args) { 
        // Cenário 1
        int nota = 7;
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);
        // Cenário 2
        nota = 6;
		resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
