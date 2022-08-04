package br.senai.sp.jandira;

import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		double juros;
		double capital;
		double taxa;
		double tempo;
		Scanner leitor;
		
		leitor= new Scanner(System.in);
		
	  System.out.print("Qual é a Capital? ");
	  capital = leitor.nextDouble();
	  
	  System.out.print("Qual é a taxa de juros? ");
      taxa = leitor.nextDouble();
      
      System.out.print("Qual é o tempo? ");
      tempo = leitor.nextDouble();
      
      juros = capital* taxa/100* tempo; //j =c.i.t
      
      System.out.println("O valor do juros é: " +juros);
      
      System.out.printf("Ao final do periodo vc tera R$%s",juros + capital);
      
	}

}
