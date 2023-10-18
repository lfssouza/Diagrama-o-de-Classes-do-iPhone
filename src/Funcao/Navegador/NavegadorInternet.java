package Funcao.Navegador;

public class NavegadorInternet implements ExibirPagina, NovaAba, AtualizarPagina{

	@Override
	public void atualizarPagina() {
		System.out.println("Pagina Atualizada");
	}

	@Override
	public void novaAba() {
		System.out.println("Aba Nova");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Pagina do navegador");
	}
}
