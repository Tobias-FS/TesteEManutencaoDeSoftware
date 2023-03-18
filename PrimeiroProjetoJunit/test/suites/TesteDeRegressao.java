package suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fisica.CinematicaTest;
import matematica.Algebratest;

@RunWith(Suite.class)
@SuiteClasses({ CinematicaTest.class, Algebratest.class })
public class TesteDeRegressao {

}
