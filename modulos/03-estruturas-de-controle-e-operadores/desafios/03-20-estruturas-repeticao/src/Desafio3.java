/*
 Desafio da estrutura while:
   Escreva um programa que solicita números inteiros ao usuário de forma contínua e soma
   todos os números informados.

   O programa deve parar de solicitar mais números e imprimir a soma deles na saída apenas
   quando o valor total somado for igual ou superior a 100.
*/

import java.util.Scanner;

public class Desafio3 {

  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);

    int somaDosNumeros = 0;
    int numero = 0;

    while(somaDosNumeros < 100) {
      System.out.println("Digite um número inteiro: ");
      numero = entrada.nextInt();
      
      somaDosNumeros += numero;
    }
    System.out.println("A soma dos números é: " + somaDosNumeros);
  }
}