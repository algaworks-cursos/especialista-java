// Casting
public class ConversaoDoubleParaFloat {

  public void main(String[] args) {
    double peso1 = 20.5;

    // float peso2 = peso1; // não compila

    float peso2 = (float) peso1;

    System.out.println(peso2);
    System.out.println(peso2);


    float taxa1 = 934.5f;
    double taxa2 = taxa1;

    System.out.println(taxa1);
    System.out.println(taxa2);
  }
}