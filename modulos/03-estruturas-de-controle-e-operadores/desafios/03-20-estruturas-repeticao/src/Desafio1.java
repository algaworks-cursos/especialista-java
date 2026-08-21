/*
 Desafio  da estrutura for:
   Escreva um programa que solicita 10 números para o usuário e imprime na saída a soma
   dos números digitados.

   Permita que o usuário digite apenas números pares. Caso um número ímpar seja informado,
   ignore e solicite um novo número ao usuário.
*/

import java.util.Scanner;

public class Desafio1 {

  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    int somaDosNumeros = 0;

    for (int i = 1; i <= 10;) {
      System.out.printf("Digite o número %s:%n", i);
      int numero = entrada.nextInt();

      if (numero  % 2 == 0) {
        somaDosNumeros += numero;
        i++;
      } else {
        System.out.println("Número ímpar! Digite novamente.");
    }
  }
     System.out.println("Soma dos números: " + somaDosNumeros);
 }
}