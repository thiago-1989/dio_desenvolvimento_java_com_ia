public class PlanoOperadora {
	public static void main(String[] args) {
		String plano = "M"; //M / T
		
        // Modo condicional convencional
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
			System.out.println("5Gb Youtube");	
		}

        // Modo condicional switch/case
		switch (plano) {
			case "T": {
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Intagram grátis");	
                System.out.println("5Gb Youtube");                
                break;
			}
			case "M": {
				System.out.println("100 minutos de ligação");
			    System.out.println("Whats e Intagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
			}
        }
		
	}
}
