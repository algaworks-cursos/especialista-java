// Desafio 02.03 — Correção de Erros
//
// O programa abaixo contém erros comuns de compilação.
// Tente compilar, leia a mensagem de erro e corrija cada problema.
// Os erros foram deixados intencionalmente para praticar.

/*
  VERSÃO COM ERROS (para praticar):

  public class CorrecaoDeErros {

    public static void main(String[] args) {
      // Erro 1: ponto e vírgula faltando
      int numero = 10

      // Erro 2: tipo incompatível
      int texto = "Olá, Java!";

      // Erro 3: variável usada antes de ser declarada
      System.out.println(resultado);
      int resultado = numero * 2;

      // Erro 4: nome de método errado
      System.out.printl("Fim do programa");
    }
  }
*/

// VERSÃO CORRIGIDA:
public class CorrecaoDeErros {

  public static void main(String[] args) {
    // Correção 1: adicionado ponto e vírgula
    int numero = 10;

    // Correção 2: tipo correto para texto
    String texto = "Olá, Java!";

    // Correção 3: declarada antes de usar
    int resultado = numero * 2;
    System.out.println("Resultado: " + resultado);

    // Correção 4: nome correto do método
    System.out.println("Texto: " + texto);
    System.out.println("Fim do programa");
  }
}
