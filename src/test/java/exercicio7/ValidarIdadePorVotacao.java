package exercicio7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import votacao.Votacao;

public class ValidarIdadePorVotacao {

	@Test
	public void idadeIgual15Anos_NaoPodeVotar() {
		assertEquals("Maria voce n pode votar", Votacao.podeVotar("Maria", 2003));
	}
	
	@Test
	public void idadeIgual16Anos() {
		assertEquals("Rodrigo seu voto e facultativo", Votacao.podeVotar("Rodrigo", 2002));
	}
}
