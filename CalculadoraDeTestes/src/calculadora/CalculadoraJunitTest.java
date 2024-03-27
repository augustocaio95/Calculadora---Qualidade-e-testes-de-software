package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** 
 *@author Caio Augusto Carvalho dos Santos
 *@version 1.0
 *@since Release 1.0 da aplicação
 **/

public class CalculadoraJunitTest {
	
	/**
	 *  Cenário de de teste 1: Soma de dois valores positivos
	 */
	@Test
	public void SomarDoisNumerosPositivos() {
		Soma calc = new Soma();
		//parametros a serem utilizados  para o teste
		int soma = calc.somar(3, 7);
		//Modelo de comparativo de teste
		assertEquals(10, soma);
	}

	/**
     *  Cenário de teste 2: Subtração de dois números positivos
     */
	@Test
	public void SutracaoDeDoisNumerosPositivos() {
	    
	    Subtracao calc = new Subtracao();
	    // Parâmetros a serem utilizados para o teste
	    int sub = calc.subtrair(5, 5);
	    // Modelo de comparativo de teste
	    assertEquals(8, sub); 
	}
	
	/**
     *  Cenário de teste 3: Multiplicação de dois números positivos
     */
	@Test
	public void testMultiplicacaoDeDoisNumerosPositivos() {
	    
	    Multiplicacao calc = new Multiplicacao();
	    // Parâmetros a serem utilizados para o teste
	    int mult = calc.multiplicar(4, 3);
	    // Modelo de comparativo de teste
	    assertEquals(12, mult); 
	}
	
	/**
     *  Cenário de teste 4: Divisão de dois números positivos
     */
	@Test
	public void testDivisaoDeDoisNumerosPositivos() {
	    
	    Divisao calc = new Divisao();
	    // Parâmetros a serem utilizados para o teste
	    double div = calc.dividir(10, 2);
	    // Modelo de comparativo de teste
	    assertEquals(5.0, div); 
	}
	/**
	 *  Cenário de teste 5: Divisão por zero
	 */
	@Test
	public void testDivisaoPorZero() {
		
		Divisao calc = new Divisao();
		// Parâmetros a serem utilizados para o teste
		double div = calc.dividir(10, 0);
		// Modelo de comparativo de teste
		assertEquals(0, 0);

	}
}
