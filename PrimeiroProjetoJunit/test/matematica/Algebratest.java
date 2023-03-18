package matematica;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Algebratest {

	public static int cont = 0;
	
//	@Before
//	public void setUp() {
//		cont++;
//		System.out.println( "Before" + cont );
//	}
	
	@BeforeClass
	public static void setUp() {
		cont++;
		System.out.println( "Before" + cont );
	}
	
	@After
	public void tearDown() {
		cont--;
		System.out.println( "Before" + cont );
	}
	
	@Test
	public void soma_quandoReebe2e3_deveRetornar5() {
//		fail("Not yet implemented");
		assertEquals(5.0, Algebra.soma(2, 3), 0.0);
	}
	
	@Ignore
	@Test
	public void soma_quandoReebe2e3negativos_deveRetornar5negativo() {
//		fail("Not yet implemented");
		assertEquals(-5.0, Algebra.soma(-2, -3), 0.0);
	}
	
	@Test
	public void soma_quandoReebe1e0_deveRetornar1() {
//		fail("Not yet implemented");
		assertEquals(1.0, Algebra.soma(1, 0), 0.0);
	}
	
	@Test
	public void fatorialRec_quandoRecebe5_deveRetornar120() {
		assertEquals(120.0, Algebra.fatorialRec(5), 0.0);
	}
	
	@Ignore
	@Test( timeout = 1000 )
	public void fatorialRec_quandoExecuta_deveTerminarEm1Seg() {
		Algebra.fatorialRec(5);
	}

	@Test( expected = ArithmeticException.class ) // espera a Exceçao ArithmeticException
	public void divisaoInteira_quandoDividePorZero_deveLancarExcecao() {
		Algebra.divisaoInteira(1, 0);
	}
	
}
