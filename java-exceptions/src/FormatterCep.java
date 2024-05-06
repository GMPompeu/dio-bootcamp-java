public class FormatterCep {

    public static void main(String[] args) {
        try {
            String cepFormatar = formatarCep("98567379");
            System.out.println(cepFormatar);
        } catch (CepInvalidoException e) {
            System.out.println("Necessário ter 8 digitos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          return "23.765-064";
    }
}
