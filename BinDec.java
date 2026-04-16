import javax.swing.JOptionPane;

public class BinDec{
	
	static int bin, dec;
	
	public static int convertBinToDec(int bin){
		int dec = 0;
		int pos = 1;
		while(bin > 0)
		{
			dec += (bin%10)*pos;
			bin /= 10;
			pos *= 2;
		}
		
		return dec;
	}
	
	public static void main(String[] args){
		bin = Integer.parseInt((JOptionPane.showInputDialog("Entre com o número em notação binária: ")));
		dec = convertBinToDec(bin);
		JOptionPane.showMessageDialog(null, "O equilante de: " + bin + " em notação decimal é: " + dec);
	}
	
}