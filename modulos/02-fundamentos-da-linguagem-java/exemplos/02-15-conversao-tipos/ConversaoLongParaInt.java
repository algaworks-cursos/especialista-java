// Casting
public class ConversaoLongParaInt {

  public void main(String[] args) {
    long x = 10;

    // int y = x; // não compila

    int y = (int) x;

    System.out.println(x);
    System.out.println(y);


    // Casting abaixo imprime valores diferentes por ter excedido o máximo de bits que cabe no tipo int
    long a = 9300000005L;
    int b = (int) a;

    System.out.println(a);
    System.out.println(b);
  }
}