import java.util.Scanner;

public class CalculadoraIndiceMassaCorporalComplexa {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite seu peso (kg): ");
    double peso = entrada.nextDouble();

    System.out.println("Digite a sua altura (m)");
    double altura = entrada.nextDouble();

    System.out.println("Digite seu sexo(M/F): ");
    char sexo = entrada.next().toUpperCase().charAt(0);

    double imc = peso / (altura * altura);
    System.out.printf("Seu IMC é: %.2f%n", imc);

    String condicao = "";

    if (sexo == 'F') {
      if (imc < 19.1) {
          condicao = "Abaixo do peso";
      } else if (imc < 25.8) {
          condicao = "Peso ideal";
      } else if (imc < 27.3) {
          condicao = "Um pouco acima do peso";
      } else if (imc < 32.3) {
          condicao = "Acima do peso ideal";
      } else {
          condicao = "Obesa";
      }
    } else if (sexo == 'M') {
      if (imc < 20.7) {
          condicao = "Abaixo do peso";
      } else if (imc < 26.4) {
          condicao = "Peso ideal";
      } else if (imc < 27.8) {
          condicao = "Um pouco acima do peso";
      } else if (imc < 31.1) {
          condicao = "Acima do peso ideal";
      } else {
          condicao = "Obeso";
      }
    } else {
	System.out.println("Sexo inválido!");
        entrada.close();
        return;
      }

     System.out.println("Condição: " + condicao);
     entrada.close();
   }
}