import javax.swing.*;

public class DecBin{
	
	static int num;
	static int bin;
	static int decimal;
	
	public static int Pot(int base, int exp)
	{
		int pot = 1;
		for(int i = 1; i <= exp; i++)
			pot *= base;
		return pot;
	}
	
	public static int convertToBin(int num){
		int bin = 0;
		int pos = 1;
		int count = 0;
		
		while(num > 0){
			bin += (num%2)*Pot(10, count);
			num /= 2;
			count++;
		}			
		
		return bin;
	}
	
	public static int binToInt(int bin)
	{
		int decimal = 0;
		int count = 0;
		while(bin > 0)
		{
			decimal += (bin%10)*Pot(2, count);
			bin /= 10;
			count++;
		}
		return decimal;
	}
	
	public static void main(String[] args){
		num = Integer.parseInt(JOptionPane.showInputDialog("Ëntre com o numero:"));
		bin = convertToBin(num);
		decimal = binToInt(bin);
		JOptionPane.showMessageDialog(null, "O equivalente em binário eh: " + bin);
		JOptionPane.showMessageDialog(null, "O equivalente em decimal eh: " + decimal);
			
	}
}