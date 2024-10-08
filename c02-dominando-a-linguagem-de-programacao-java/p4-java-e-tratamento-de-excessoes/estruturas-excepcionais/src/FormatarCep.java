public class FormatarCep {
    
    public static void main(String[] args) {
        
        try {
            String cep = formatarCep("23765064");
            System.out.println(cep);
        } catch (CepInvalidoException e) {
            System.out.println("Formato inválido!");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }

}
