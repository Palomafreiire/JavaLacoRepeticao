package LacosDeRepeticao;

import java.util.Scanner;

/*
2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
*/
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int numero, cont=0, contImp=0;
		
		for (int y= 1; y<=10; y++)
		{
		System.out.println("Me diga 10 numeros: " +y+ " número");
		numero = ler.nextInt();
		
		if (numero % 2 ==0)
			{
				cont++;	
			}
			if (numero % 2 ==1) 
			{
				contImp++;
			}
		
		}
			System.out.println("Os pares são: " +cont+ "\nOs impares são: " +contImp);
		
	}

}
