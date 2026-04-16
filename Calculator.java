import javax.swing.JOptionPane;
import java.util.Scanner;

public class Calculator{
	
	static float num1, num2, res;
	static char opt;
	static char SENTINELA_FIM = '0';
	
	static Scanner reader = new Scanner(System.in);
	
	//Menu
	
	static void Menu()
	{
		String menu = "";
		menu += "------------------------Menu------------------------\n";
		menu += "1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n0 - Sair \n\n";
		
		System.out.print(menu);
	}
	
	//Sum
	static float Sum(float a, float b)
	{
		return (a+b);
	}
	//Sub
	static float Sub(float a, float b)
	{
		return (a - b);
	}
	
	//Multiplication
	static float Multi(float a, float b){
		return (a*b);
	}
	
	//Validate / and % operations
	static Boolean valDiv(float b)
	{
		return (b != 0);
	}
	
	//Div
	static float Div(float a, float b)
	{
		return a/b;
	}
	
	//Ler num
	static float lerNum(){
		float num = reader.nextFloat();
		return num;
	}
	
	//Read Option
	static char lerOpt()
	{
		char option;
		option = reader.next().charAt(0);
		return option;
	}
	
	//Operation
	static float Operacao(char opt, float num1, float num2)
	{
		switch(opt)
		{
			case '1':
				res = Sum(num1, num2);
				break;
			case '2':
				res = Sub(num1, num2);
				break;
			case '3':
				res = Multi(num1, num2);
				break;
			case '4':
				if(valDiv(num2))
					res = Div(num1, num2);
				else
					System.out.print("ERROR: Impossível dividir por 0! \n");
				break;
			default:
				res = 0;
				break;
		}
		
		return res;
	}
	
	//Imprimir resultado
	static void printRes()
	{
		System.out.print("O resultado é: " + res + "\n");
	}
	
	public static void main(String[] args){
		
		Boolean isValid = false;
		
		Menu();
		
		System.out.println("Entre com a opcao:");
		opt = lerOpt();
		
		isValid = (opt != '0');
		
		if(isValid)
		{
			do{
				System.out.println("Entre com o primeiro número:");
				num1 = lerNum();
				System.out.println("Entre com o segundo número:");
				num2 = lerNum();
				Operacao(opt, num1, num2);
				printRes();
				
				System.out.print("\n----------------------------------------------------\n");
				
				System.out.println("Entre com a opcao:");
				opt = lerOpt();
				
				res = 0;
				
			} while(opt != '0');
		}
		else
			System.out.print("ERROR: opcao inválida!");
		
	}
	
}