package matematica;

public class Algebra {

	public static double raiz(double numero) {
		double count = 1;
		for (int i = 1; numero - i > 2; i+=2) {
			numero -= i;
			count++;
		}		
		return count;
	}
	
	public static int maior(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		}
	}
	
	public static double soma(double ... numeros) {
		double total = 0;
		for(double n : numeros)
			total+= n;
		return total;
	}
	
	public static double media(double ... numeros) {
		return soma(numeros) / numeros.length;
	}
	
	public static double divisaoReal(double x, double y) {
		return x/y;
	}
	
	public static int divisaoInteira(int x, int y) {
		return x/y;
	}

	public static double potencia(double base, double potencia) {
		double resultado = 1;
		for(int i=0;i<potencia;i++) {
			resultado*=base;
		}
		return resultado;
	}

	public static int fatorialRec(int n){
        if (n < 1) {
            throw new IllegalArgumentException("par�metro igual a zero ou negativo (" + n + ')');
        }
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return n==1?1:n*fatorialRec(n-1);
	}
}

