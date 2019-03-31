package exercicio5;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PreEPosCondicoesDaClasse {
	
	@BeforeClass
	public static void preCondicao_AntesClasse() {
		System.out.println("Executou pre condicao da classe");
	}
	
	
	@Before
	public void preCondicao() {
		System.out.println("Executou a pre condicao");
	}
	
	@Test
	public void teste1() {
		System.out.println("Executou teste1");
	}
	
	@Test
	public void teste2() {
		System.out.println("Executou teste2");
	}
	
	@After
	public void posCondicao() {
		System.out.println("Executou a pos condicao");
	}
	@AfterClass
	public static void posCondicao_DepoisClasse() {
		System.out.println("Executou depois de todos os testes");
	}
}
