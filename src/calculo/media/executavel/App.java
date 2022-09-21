package calculo.media.executavel;


import javax.swing.JOptionPane;

public class App {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento do aluno?");
		String disciplina1 = JOptionPane.showInputDialog("Qual a disciplina 1");
		String disciplina2 = JOptionPane.showInputDialog("Qual a disciplina 2");
		String disciplina3 = JOptionPane.showInputDialog("Qual a disciplina 3");
		String disciplina4 = JOptionPane.showInputDialog("Qual a disciplina 4");
		String nota1 = JOptionPane.showInputDialog("Qual a nota do aluno?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota do aluno?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota do aluno?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota do aluno?");
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		
		
		

		
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado());
}
	
}
