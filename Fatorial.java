public class Fatorial {
        // versao iterativa do cálculo do fatorial, incluindo o teste para n=0
        public int calcularFatorial(int n) throws IllegalArgumentException{
            if (n < 0) 
		    throw new IllegalArgumentException("não existe fatorial para números negativos");
            int resultado = 1;
            if (n != 0) {
		for (int i = 2; i <= n; i++)
                	resultado *= i;
	    }
            return resultado;
        }
}
