// Estrutura Condicional Aninhada

public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 6;

	if (nota >= 7)
		System.out.println("Aprovado");
		
		if (nota == 10)
			System.out.println("Nota Máxima");

	else if (nota >= 5 && nota < 7)
		System.out.println("Recuperação");
	else
		System.out.println("Reprovado");
    }
}
