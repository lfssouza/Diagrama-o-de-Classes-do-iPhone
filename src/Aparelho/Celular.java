package Aparelho;

import Funcao.Ligacao.AparelhoTelefonico;
import Funcao.Ligacao.Atender;
import Funcao.Ligacao.CorreioVoz;
import Funcao.Ligacao.Telefonar;
import Funcao.Musical.PausarMusica;
import Funcao.Musical.ReprodutorMusical;
import Funcao.Musical.SelecionarMusica;
import Funcao.Musical.TocarMusica;
import Funcao.Navegador.AtualizarPagina;
import Funcao.Navegador.ExibirPagina;
import Funcao.Navegador.NavegadorInternet;
import Funcao.Navegador.NovaAba;

public class Celular {
	public static void main(String[] args) {
		ReprodutorMusical reprodutorMusicas = new ReprodutorMusical();
		
		PausarMusica pausar = reprodutorMusicas;
		SelecionarMusica selecionar = reprodutorMusicas;
		TocarMusica reproduzir = reprodutorMusicas;
		
		NavegadorInternet navegadorInternet = new NavegadorInternet();
		
		AtualizarPagina atualizar = navegadorInternet;
		ExibirPagina exibir = navegadorInternet;
		NovaAba nova = navegadorInternet;
		
		AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
		
		Telefonar ligar = aparelhoTelefonico;
		Atender atender = aparelhoTelefonico;
		CorreioVoz correio = aparelhoTelefonico;
		
		selecionar.selecionarMusica();
		reproduzir.tocarMusica();
		pausar.pausarMusica();
		
		exibir.exibirPagina();
		atualizar.atualizarPagina();
		nova.novaAba();
		
		ligar.ligar();
		atender.atenderLigacao();
		correio.iniciarCorreioVoz();
	}
}
