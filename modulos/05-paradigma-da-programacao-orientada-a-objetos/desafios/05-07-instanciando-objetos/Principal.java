public class Principal {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();

        cachorro1.nome = "Bob";
        cachorro1.raca = "Salsicha";
        cachorro1.sexo = 'F';
        cachorro1.idade = 18;

        cachorro2.nome = "Princesa";
        cachorro2.raca = "Pitbull";
        cachorro2.sexo = 'M';
        cachorro2.idade = 19;

        System.out.println("Cachorro 1");
        System.out.println("===========");
        System.out.printf("Nome: %s%n", cachorro1.nome);
        System.out.printf("Raça: %s%n", cachorro1.raca);
        System.out.printf("Sexo: %s%n", cachorro1.sexo);
        System.out.printf("Idade: %d%n", cachorro1.idade);

        System.out.println();

        System.out.println("Cachorro 2");
        System.out.println("===========");
        System.out.printf("Nome: %s%n", cachorro2.nome);
        System.out.printf("Raça: %s%n", cachorro2.raca);
        System.out.printf("Sexo: %s%n", cachorro2.sexo);
        System.out.printf("Idade: %d%n", cachorro2.idade);
    }
}
