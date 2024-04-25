public class MyClass {
    public static void main(String[] args) {
        String firstName = "Guilherme";
        String secondName = "Pompeu Mascarenhas";

       String nomeCompleto = nomeCompleto(firstName, secondName);

       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String firstName, String secondname){
        return firstName.concat(" ").concat(secondname);
    }
}
