package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraJunitTest {
	@Test
	public void SomarDoisNumerosPositivos() {
		Soma calc = new Soma();
		int soma = calc.somar(3, 7);
		assertEquals(10, soma);
	}

	@Test
	public void SutracaoDeDoisNumerosPositivos() {
		Subtracao calc = new Subtracao();
		int sub = calc.subtrair(5, 5);
		assertEquals(2, sub);
	}

	@Test
	public void testMultiplicacaoDeDoisNumerosPositivos() {
		Multiplicacao calc = new Multiplicacao();
		int mult = calc.multiplicar(4, 3);
		assertEquals(12, mult);
	}

	@Test
	public void testDivisaoDeDoisNumerosPositivos() {
		Divisao calc = new Divisao();
		double div = calc.dividir(10, 2);
		assertEquals(5.0, div);
	}

	@Test
	public void testDivisaoPorZero() {
		Divisao calc = new Divisao();
		double div = calc.dividir(10, 2);

	}
}
