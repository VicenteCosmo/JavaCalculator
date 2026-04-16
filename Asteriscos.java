import javax.swing.JOptionPane;

public class Asteriscos{
	
	public static void main(String[] args){
		
		String output = "*";
		
		for(int i = 1; i <= 7; i++)
		{
			if(i%2 == 0)
				System.out.print(" ");
			for(int j = 1; j <= 10; j++)
				System.out.print(output);
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 1; i <= 10; i++)
		{
			
			for(int k = 1; k <= i-1; k++)
				System.out.print(" ");
			
			for(int j = 11-i; j >= 1; j--)
				System.out.print(output);
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 1; i <= 10; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print(output);
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 10; i >= 1; i--)
		{
			for(int j = i; j >= 1; j--)
				System.out.print(output);
			System.out.println();
		}
		
		System.out.println("\n");
		
		for(int i = 10; i >= 1; i--)
		{
			for(int j = i-1; j >= 1; j--)
				System.out.print(" ");
			for(int j = 1; j <= 11-i; j++)
				System.out.print(output);
			System.out.println();
		}	
		
		
		
	}	
}