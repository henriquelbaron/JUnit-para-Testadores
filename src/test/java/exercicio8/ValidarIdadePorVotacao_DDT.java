package exercicio8;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import votacao.Votacao;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_DDT {
	public String nome;
	public int anoDeNascimento;
	public String resultado;

	public ValidarIdadePorVotacao_DDT(String nome, int anoDeNascimento, String resultado) {
		super();
		this.nome = nome;
		this.anoDeNascimento = anoDeNascimento;
		this.resultado = resultado;
	}

	@Test
	public void validarObrigatoriedaDeDeVoto() {
		assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "Maria", 2003, "Maria voce nao pode votar" },
				{ "Rodrigo", 2002, "Rodrigo seu voto e facultativo" }, { "Joao", 2001, "Joao seu voto é facultativo" },
				{ "Carla", 2000, "Carla seu voto é obrigatorio" }, { "Jose", 1993, "Jose seu voto é obrigatorio" },
				{ "Ana", 1948, "Ana seu voto é obrigatorio" }, { "Pedro", 1947, "Pedro seu voto é facultativo" } });
	}
}
