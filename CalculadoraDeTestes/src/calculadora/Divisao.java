package calculadora;

/** 
 *  @author Caio Augusto Carvalho dos Santos
 *  @version 1.3
 *  @since Release 1.3 da aplicação
 *  **/

public class Divisao {
	/** 
	 * @param a, primeiro valor utilizado para divisão
	 * @param b, segundo valor utilizado para divisão
	 * @return , resultado de rettorno
	 *  **/
	
	 public double dividir(double a, double b) {
	        if (b == 0) {
	            System.out.println("Não é possível dividir por 0");
	            return Double.NaN;
	        } else {
	            return a / b;
	        }
	    }
}
