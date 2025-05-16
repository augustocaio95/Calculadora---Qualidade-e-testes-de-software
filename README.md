## Descrição

Este projeto é uma implementação de uma calculadora simples em Java que realiza operações matemáticas básicas: soma, subtração, multiplicação e divisão, ele visa mostrar conceitos básicos de cenários de testes. A classe `CalculadoraTestes` contém cenários de teste para verificar a funcionalidade de cada operação, assegurando que as implementações sejam corretas e robustas.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação usada para implementar a calculadora e os testes.
- **Java Development Kit (JDK)**: Ambiente necessário para compilar e executar o código Java.
- **JUnit**: Framework de testes para Java utilizado para criar e executar os testes unitários.
- **IDE (como IntelliJ IDEA, Eclipse ou NetBeans)**: Ferramentas recomendadas para desenvolvimento em Java.

## Funcionalidades

- **Soma**: Adiciona dois números e fornece o resultado.
- **Subtração**: Calcula a diferença entre dois números.
- **Multiplicação**: Multiplica dois números e retorna o produto.
- **Divisão**: Divide um número por outro, tratando cuidadosamente o caso de divisão por zero e retornando `NaN` caso a divisão seja inválida.

## Classes Principais

- **CalculadoraTestes**: Classe responsável por executar os testes das operações básicas da calculadora.
    ```java
    public class CalculadoraTestes {
        public static void main(String[] args) {
            // Testes para as operações
        }
    }
    ```

- **Soma**: Classe que implementa a operação de soma. 
    ```java
    public class Soma {
        public int somar(int a, int b) {
            return a + b;
        }
    }
    ```

- **Subtracao**: Classe que implementa a operação de subtração. 
    ```java
    public class Subtracao {
        public int subtrair(int a, int b) {
            return a - b;
        }
    }
    ```

- **Multiplicacao**: Classe que implementa a operação de multiplicação. 
    ```java
    public class Multiplicacao {
        public int multiplicar(int a, int b) {
            return a * b;
        }
    }
    ```

- **Divisao**: Classe que implementa a operação de divisão. 
    ```java
    public class Divisao {
        public double dividir(double a, double b) {
            if (b == 0) {
                System.out.println("Não é possível dividir por 0");
                return Double.NaN;
            } else {
                return a / b;
            }
        }
    }
    ```

## Cenários de Testes

A classe `CalculadoraTestes` executa uma série de cenários de teste para validar as operações:

1. **Soma**
   - Soma de dois valores positivos.
   - Soma com zero.
   - Soma com um número negativo.

2. **Subtração**
   - Subtração de dois valores.
   - Subtração envolvendo zero e números negativos.

3. **Multiplicação**
   - Multiplicação de números positivos e negativos.
   - Multiplicação por zero.

4. **Divisão**
   - Divisão de números positivos.
   - Divisão envolvendo negativos.
   - Validação do tratamento da divisão por zero.
