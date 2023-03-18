package fisica;

public class Calorimetria {
	public double qtdCalor(double m, double c, double deltaTeta) {
		return m*c*deltaTeta;
	}
	
	public double calorLatente(double m, double L) {
		return m*L;
	}
	
	public double pressaoClapeyron(double V, double n, double R, double T) {
		return (n*R*T)/V;
	}
}
