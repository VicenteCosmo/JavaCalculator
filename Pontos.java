import javax.swing.*;

public class Pontos{
	
	static String res = "", num;
	
	public static String converterBin(int decimal)
	{
		while(decimal > 0)
		{
			res += decimal%2;
			decimal /=2;
		}
		return res;
	}
	
	public static String inverterNum(String num)
	{
		String inverter = new StringBuilder(num).reverse().toString();
		
		return inverter;
	}
	
	public void main(String[] args){
		
		num = JOptionPane.showInputDialog("Entre com número na base decimal:");
		num = converterBin(Integer.parseInt(num));
		num = inverterNum(num);
		JOptionPane.showMessageDialog(null, "O equivalente em binário é: " + num);
	}
	
}