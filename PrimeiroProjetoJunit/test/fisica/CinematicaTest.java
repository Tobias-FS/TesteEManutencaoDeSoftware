package fisica;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CinematicaTest {
	
	public static Cinematica c;
	
	@BeforeClass
	public static void setUp() {
		c = new Cinematica();
	}

	@Test
	public void testAceleracaoEscalar_quandoRecebe20e6_deveRetornarAprox3() {
		assertEquals(3.33, c.aceleracaoEscalar(20.0, 6.0), 0.01);
	}

	@Test
	public void testDeslocamentoUniforme_quandoRecebe0e10e6_deveRetornar60() {
		Cinematica c = new Cinematica();
		assertEquals(60.0, c.deslocamentoUniforme(0.0, 10, 6.0), 0.01);
	}

}
