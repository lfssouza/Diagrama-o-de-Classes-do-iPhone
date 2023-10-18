package Funcao.Musical;

public class ReprodutorMusical implements SelecionarMusica, TocarMusica, PausarMusica {

	@Override
	public void pausarMusica() {
		System.out.println("Musica pausada");
	}

	@Override
	public void tocarMusica() {
		System.out.println("Reproduzindo musica");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando Musica");
	}
	
}
