public class Computador {
    public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMensseger fbm = new FacebookMensseger();
		fbm.enviarMensagem();
		fbm.receberMensagem();
		
		Mensseger tlg = new Mensseger();
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
	}
}
