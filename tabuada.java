import javax.swing.*;

public class tabuada{
	
	static String res = " ";
	
	public static void mostrarTabuada(){
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número"));
		for(int i = 1; i <= 10; i++)
			res += num + " x " + i + " = " + (num*i) + "\n";
		JOptionPane.showMessageDialog(null, res, "Tabuada de Multiplicar", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args){
		mostrarTabuada();
	}
}