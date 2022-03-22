import java.util.Scanner;

public class Classe 
{
	public static void main (String [] args)
	{
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		System.out.print("Primeiro valor: ");
		num1 = entrada.nextInt();
		System.out.print("Segundo valor: ");
		num2 = entrada.nextInt();
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
		entrada.close();
	}
}
