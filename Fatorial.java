public class Fatorial {
	// Versao iterativa do cálculo do fatorial, incluindo o teste para teste = 0
	/*
	public static void main(String[] args) {
		System.out.println(calcularFatorial(5));
	}
	*/
	
	//public static int calcularFatorial(int n) {
	public int calcularFatorial(int n) {
		int resultado = 1;
		
		if ( n != 0 ) {
			for (int i = 2; i <= n; i++)
				resultado *= i;
		}
		
		return resultado;
		
	}
}