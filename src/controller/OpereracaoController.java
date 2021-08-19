/*
a-	Foi definido duas condições de parada, uma para “parar” a aplicação ao chegar 
no “valor= 1” e outra para não deixar valores maior do que o numeral 12.
b-	O Cálculo é gerado partido da primícia que enquanto o valor da variável “valor” 
não for igual a “1” ele vai repetir o processo de multiplicar o valor atual de 
“valor” vezes o valor de “valor-1”. Para o estouro de memória, como não é 
possível que o resultado de uma fatoração seja igual a zero, foi atribuído o 
retorno igual “0” para que o programa consiga identificar um estouro de memória.

 */

package controller;

public class OpereracaoController {
	public int Fator(int valor) {
		if (valor <= 1) { 
			return 1; 
		}
		if (valor >= 12) {
			return 0;	
		} 
			else {
				return valor * Fator(valor-1);
		}
	}
}