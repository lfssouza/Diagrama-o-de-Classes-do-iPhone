package Funcao.Ligacao;

public class AparelhoTelefonico implements Atender, CorreioVoz, Telefonar {

	@Override
	public void ligar() {
		System.out.println("Ligando");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Ouvindo o correio de voz");
	}

	@Override
	public void atenderLigacao() {
		System.out.println("Atendendo a ligação");
	}
}
