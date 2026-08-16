public class Principal {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa();
        eu.nome = "Gustavo";
        eu.cpf = "123.456.789-00";
        eu.anoNascimento = 2006;

        Pessoa voce = new Pessoa();
        voce.nome = "Alice";
        voce.cpf = "123.456.799-99";
        voce.anoNascimento = 2007;


        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Branco";
        meuCarro.fabricante = "Ford";
        meuCarro.modelo = "Ford Ka";
        meuCarro.proprietario = eu;

//        meuCarro.proprietario = new Pessoa();
//        meuCarro.proprietario.nome = "Gustavo Emiliano";
//        meuCarro.proprietario.cpf = "000.000.000-00";
//        meuCarro.proprietario.anoNascimento = 2021;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2026;
        seuCarro.cor = "Preto";
        seuCarro.modelo = "Fusion";
        seuCarro.fabricante = "Ford";
        seuCarro.proprietario = voce;

        System.out.println("Meu carro");
        System.out.println("----------");
        System.out.printf("Modelo do meu carro: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu carro");
        System.out.println("----------");
        System.out.printf("Modelo do seu carro: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietário: %s%n", seuCarro.proprietario.nome);
    }
}