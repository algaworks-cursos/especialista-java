public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoFabricacao = 2021;
        meuCarro.cor = "Branco";
        meuCarro.modelo = "Ford Ka";
        meuCarro.fabricante = "Ford";

        Pessoa dono1 = new Pessoa();
        dono1.nome = "Gustavo";
        dono1.cpf = "111.222.333-44";
        dono1.anoNascimento = 1995;

        meuCarro.proprietario = dono1;

        Carro seuCarro = new Carro();
        seuCarro.anoFabricacao = 2026;
        seuCarro.cor = "Preto";
        seuCarro.modelo = "Fusion";
        seuCarro.fabricante = "Ford";

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
    }
}