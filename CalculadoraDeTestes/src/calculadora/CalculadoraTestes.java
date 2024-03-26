package calculadora;

public class CalculadoraTestes {

	public static void main(String[] args) {
		Soma calc = new Soma();
		Subtracao subt = new Subtracao();
		Multiplicacao multi = new Multiplicacao();
		Divisao div = new Divisao();

		// Cenário de teste 1: Soma de dois valores
		int soma = calc.somar(3, 7);
		System.out.println("A soma de 3 + 7 é = " + soma);

		// Cenário de teste 2: Soma de dois valores sendo um zero
		soma = calc.somar(3, 0);
		System.out.println("A soma de 3 + 0 é = " + soma);

		// Cenário de teste 3: Soma de dois valores sendo que ambos são zero
		soma = calc.somar(0, 0);
		System.out.println("A soma de 0 + 0 é = " + soma);

		// Cenário de teste 3: Soma de dois valores sendo um negativo
		soma = calc.somar(3, -1);
		System.out.println("A soma de 3 + (-1) é = " + soma);

		// Cenario de teste 4: Subtração de dois valores
		int subtrair = subt.subtrair(5, 5);
		System.out.println("\nA subtração de 5 - 5 é = " + subtrair);

		// Cenário de teste 5: Subtração de dois valores sendo um zero
		subtrair = subt.subtrair(8, 0);
		System.out.println("A subtração de 8 - 0 é = " + subtrair);

		// Cenário de teste 6: Subtração de dois valores sendo um negativo
		subtrair = subt.subtrair(8, -5);
		System.out.println("A subtração de 8 - (-5) é = " + subtrair);

		// Cenário de teste 7: Subtração de dois valores sendo ambos zero
		subtrair = subt.subtrair(0, 0);
		System.out.println("A subtração de 0 - 0 é = " + subtrair);

		// Cenário de teste 8: Multiplicação de dois números positivos
		int multiplicar = multi.multiplicar(3, 4);
		System.out.println("\nA multiplicação de 3 * 4 é = " + multiplicar);

		// Cenário de teste 9: Multiplicação de um número positivo por um número
		// negativo
		multiplicar = multi.multiplicar(5, -2);
		System.out.println("A multiplicação de 5 * (-2) é = " + multiplicar);

		// Cenário de teste 10: Multiplicação de dois números negativos
		multiplicar = multi.multiplicar(-4, -2);
		System.out.println("A multiplicação de (-4) * (-2) é = " + multiplicar);

		// Cenário de teste 11: Multiplicação de um numero positivo por zero
		multiplicar = multi.multiplicar(80, 0);
		System.out.println("A multiplicação de 80*0 é =" + multiplicar);

		// Cenário de teste 12: Divisão de dois números inteiros positivos
		double dividir = div.dividir(10, 2);
		System.out.println("\nA divisão de 10 / 2 é = " + dividir);

		// Cenário de teste 13: Divisão de um número inteiro negativo por um número
		// inteiro positivo
		dividir = div.dividir(-15, 3);
		System.out.println("A divisão de (-15) / 3 é = " + dividir);

		// Cenário de teste 14: Divisão de dois números inteiros negativos
		dividir = div.dividir(-20, -4);
		System.out.println("A divisão de (-20) / (-4) é = " + dividir);

		// Cenário de teste 15: Divisão por zero
		dividir = div.dividir(50, 0);
		System.out.println("A divisão de 50 / 0 é = " + dividir);

	}

}
