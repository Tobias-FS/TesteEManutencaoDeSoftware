package fisica;

import matematica.Algebra;

public class Cinematica {
	public double aceleracaoEscalar(double velocidade, double tempo) {
		return velocidade/tempo;
	}
	
	public double deslocamentoUniforme(double posInicial, double velocidade, double tempo) {
		return posInicial + velocidade*tempo;
	}
	
	public double deslocamentoAcelerado(double posInicial, double velInicial, double aceleracao, double tempo) {
		return posInicial + velInicial*tempo + (aceleracao*Algebra.potencia(tempo,2))/2;
	}
	
	public double torricelli(double velInicial, double aceleracao, double deslocamento) {
		return Algebra.raiz(Algebra.potencia(aceleracao,2) + 2*aceleracao*deslocamento);
	}
}
