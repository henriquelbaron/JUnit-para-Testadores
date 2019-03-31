package exercicio13;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ValidacoesFluentes {

	@Test
	public void validacaoEqualsTo() {
		String produto = "TV 40 polegadas";
		assertThat(produto, equalTo("TV 40 polegadas"));
	}

	@Test
	public void valicaoIs() {
		int codigo = 50;
		assertThat(codigo, is(50));
	}

	@Test
	public void validaoAnyOf() {
		String resultadoObtido = "A cor selecionada foi vermelha.";
		assertThat(resultadoObtido, anyOf(containsString("vermelho"), containsString("vermelha")));
	}

	@Test
	public void validacaoHasItems() {
		List<String> listaProdutos = new ArrayList<String>();
		listaProdutos.add("Iphone");
		listaProdutos.add("TV");
		listaProdutos.add("Adaptador");

		assertThat(listaProdutos, hasItem("Adaptador"));
	}

}
