package test.java.algorithm.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fluppi.algorithm.testing.Testerklasse;

public class TesterklasseTest {

	@Test
	public void testeTestIsTrue() {
		Testerklasse k = new Testerklasse();
		assertTrue("falsches Ergebnis :(", k.test());
	}
	
	@Test
	public void testeTestIsFalse() {
		Testerklasse k = new Testerklasse();
		assertFalse("falsches Ergebnis :(", k.test());
	}
}
