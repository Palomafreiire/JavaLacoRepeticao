package LacosDeRepeticao; 

import java.util.Scanner;  //TESTE COM O WHILE

public class Teste {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n1, n2;
		
		System.out.println("\nEscreva o primeiro número: ");
		n1 = ler.nextInt();
		System.out.println("\nEscreva o segundo número: ");
		n2 = ler.nextInt();
		while (n2!=0) 
		{
			System.out.println("\nA divisão é: " + n1/n2);
			System.out.println("\nEscreva o primeiro número: ");
			n1 = ler.nextInt();
			System.out.println("\nEscreva o segundo número: ");
			n2 = ler.nextInt();
			
		}
		
			System.out.println("\nNão existe número dividido por ZERO!!!");
	}

}
