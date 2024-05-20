public abstract class ServicoPai {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}   
