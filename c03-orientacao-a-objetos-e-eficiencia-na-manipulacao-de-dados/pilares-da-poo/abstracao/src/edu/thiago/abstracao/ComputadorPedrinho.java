package edu.thiago.abstracao;

/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();

		FacebookMessenger fcb = new FacebookMessenger();
		System.out.println("\nFacebook");
		fcb.enviarMensagem();
		fcb.receberMensagem();

		ServicoMensagemInstantanea tlg = new Telegram();
		System.out.println("\nTelegram");
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}
}