package view;
import javax.swing.JOptionPane;
import controller.OpereracaoController;

public class Principal_Fatorizacao {
	public static void main(String[] args) {
		OpereracaoController op = new OpereracaoController();
		int valor;
		valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para realizar sua fatoriza��o"));
		int resultado = op.Fator(valor);
		if (resultado == 0) {
			System.out.println("N�o � Possivel Calcular devido ao estouro de memoria");
		}
		else {
			System.out.println("O Resultado � " +resultado);
		}
	}
}
