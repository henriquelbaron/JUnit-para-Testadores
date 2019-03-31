package exercicio12;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Assert.*;
public class TempoExecucaoTeste {

	
	@Test(timeout = 1000)
	public void naoPassaPeloTimeOut() {
		assertTrue(true);
	}
	
	@Test(timeout = 1000)
	public void apresentaErroTimeout() throws InterruptedException {
		Thread.sleep(1001);
	}
}
