import javax.swing.*;

public class checkAge{
	
	final static int IDADE_LMITE = 18;
	static String output = "";
	static String nome;
	static int idade;
	
	static void Check(String nome, int idade){
		output = "O indivíduo " + nome + " não tem idade para ter carta de condução!";
		if(idade >= IDADE_LMITE)
			output = "O indivíduo " + nome + " tem idade para ter carta de condução!";	
		JOptionPane.showMessageDialog(null, output, "Check Age", JOptionPane.WARNING_MESSAGE);
	}
	
	public static void main(String[] args){
		nome = JOptionPane.showInputDialog("Entre com o nome do indivíduo:");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a idade do indivíduo:"));
		
		Check(nome, idade);
	}
	
}