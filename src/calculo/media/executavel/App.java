package calculo.media.executavel;

import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("informe a nota 1");
		String nota2 = JOptionPane.showInputDialog("informe a nota 2");
		String nota3 = JOptionPane.showInputDialog("informe a nota 3");
		String nota4 = JOptionPane.showInputDialog("informe a nota 4");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) /4;
		
		/*Media para aprovação é 70*/
		
		if(media >=50) {
		
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno esta aprovado com a média: " + media);
			}else {
				JOptionPane.showMessageDialog(null, "Aluno esta em recuperaçãp com a média: " + media);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno esta reprovado com media de: " + media);
		}
		
		
	}

}
