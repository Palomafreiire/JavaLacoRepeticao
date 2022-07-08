package LacosDeRepeticao;

import java.util.Scanner;

/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.
 * 
 */

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int idade, idadeMais, idadeMenor;
		idade = 0;
		idadeMais=0;
		idadeMenor=0;
		
		System.out.println("\nDiga a sua idade: ");
		idade = ler.nextInt();
			
		while (idade!=-99)
		{
			
			if (idade < 21)
			{
				idadeMenor++;
			}
			 if (idade>50) 
			{	
				idadeMais++;
			}	
			System.out.println("\nDiga a sua idade: ");
			idade = ler.nextInt();					
		 }
		
			System.out.println("A idade -21 foi de: "+idadeMenor);
			System.out.println("nAs pessoas +50 foi: " +idadeMais);
			
	}

}
