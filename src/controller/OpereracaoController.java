/*
a-	Foi definido duas condi��es de parada, uma para �parar� a aplica��o ao chegar 
no �valor= 1� e outra para n�o deixar valores maior do que o numeral 12.
b-	O C�lculo � gerado partido da prim�cia que enquanto o valor da vari�vel �valor� 
n�o for igual a �1� ele vai repetir o processo de multiplicar o valor atual de 
�valor� vezes o valor de �valor-1�. Para o estouro de mem�ria, como n�o � 
poss�vel que o resultado de uma fatora��o seja igual a zero, foi atribu�do o 
retorno igual �0� para que o programa consiga identificar um estouro de mem�ria.

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