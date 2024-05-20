public class Computador {
    public static void main(String[] args) {

        ServicoPai smi = null;

        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn")) {
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm"))
            smi = new FacebookMensseger();
        else if (appEscolhido.equals("tlg"))
            smi = new Mensseger();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
