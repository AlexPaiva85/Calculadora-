package treinando;

import javax.swing.JOptionPane;

public class Calculadora {

public static void main(String[] args) {
		
		double soma;
		double subtracao;
		double divisao;
		double multiplicacao;
		int primeiroValor = 0;
		int segundoValor = 0;
		
		 primeiroValor = Integer.parseInt( JOptionPane.showInputDialog("Digite o primeiro valor "));
		
		 int opc = Integer.parseInt(JOptionPane.showInputDialog("AGORA SELECIONE UMA OPERA��O: \n "
		 		+ "\n [1] SOMAR"
				+ "\n [2] DIMINUIR "
				+ "\n [3] MULTIPLICAR "
				+ "\n [4] DIVIDIR "
				+ "\n\n           DIGITE UMA OP��O!"));
		 
		
		 segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor "));
		
	
		
		switch (opc) {
		case 1:
			
			soma = primeiroValor + segundoValor;
			JOptionPane.showMessageDialog(null, "O resultado da soma � = " +soma );
			
			break;

		case 2:
			
			subtracao = primeiroValor - segundoValor;
			JOptionPane.showMessageDialog(null, "O resultado da subtra��o � = " +subtracao );
			
			break;
			
		case 3:
		
			multiplicacao = primeiroValor * segundoValor;
			JOptionPane.showMessageDialog(null, "O resultado da multiplica��o � = " +multiplicacao);
			
			break;
			
		case 4:
			
			if (primeiroValor < segundoValor){
                JOptionPane.showMessageDialog(null, "Impossivel realizar calculo!! \n");
            }
            else
            {
			
			divisao = primeiroValor/segundoValor;
			JOptionPane.showMessageDialog(null, "O resultado da divis�o � = " +divisao);
            }
			
			break;
			default:
			JOptionPane.showMessageDialog(null, "Op��o Invalida!!");
				
		}	
	}
}

