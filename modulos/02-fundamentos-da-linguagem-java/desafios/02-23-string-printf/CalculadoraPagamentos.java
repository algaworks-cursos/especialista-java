// Desafio 

/*
  A empresa que você trabalha descobriu que você está indo muito bem neste
  curso de Java e pediu para que você desenvolvesse um programa que calcula
  os pagamentos para os prestadores de serviços da empresa.

  Este programa deve receber as seguintes entradas de dados do usuário:
    • Nome (texto)
    • Valor por hora (decimal)
    • Horas trabalhadas (inteiro)
    • Valor dos descontos (decimal)

   A saída do programa deve ser um resumo da folha de pagamento, mostrando os
   cálculos e os resultados finais, como no exemplo abaixo:

    Folha de pagamento: Thiago Faria
    172 horas x R$150.20 = R$25834.40
    Descontos: R$482.88
    Total devido: R$25351.52
    Use a formatação de saída com printf para imprimir na saída e o
    tipo Scanner para receber a entrada de dados do usuário. 
*/

import java.util.Scanner;

public class CalculadoraPagamentos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  

    System.out.println("Bem vindo a Calculadora de Pagamentos!");

    System.out.println("Digite o seu nome: ");
    String nome = sc.nextLine();

    System.out.print("Valor que recebe por hora: ");
    double valorHora = sc.nextDouble();
  
    System.out.print("Entre com a quantidade de horas trabalhadas: ");
    int horasTrabalhadas = sc.nextInt();

    System.out.print("Entre com o valor dos descontos: ");
    double valorDescontos = sc.nextDouble();


    double valorBruto = valorHora * horasTrabalhadas;
    double valorLiquido = valorBruto - valorDescontos;


    System.out.printf("\nFolha de Pagamento: %s%n", nome);
    System.out.printf("%d horas x R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, valorBruto);
    System.out.printf("Descontos: R$%.2f%n", valorDescontos);
    System.out.printf("Total devido: R$%.2f%n", valorLiquido);
  }
}