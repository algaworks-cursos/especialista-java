# Anotações — Módulo 05: Mergulhando em Orientação a Objetos

## O paradigma da Programação Orientada a Objetos (POO)

Existem diferentes paradigmas de programação. 
Programação Imperativa:
- Programação Procedural
- Programação Orientada a Objetos (POO)

Programação Declarativa:
- Programação Funcional
- Programação Reativa

Na POO, modelamos o mundo real através de **objetos** que possuem características (atributos) e comportamentos (métodos).

---

## Entendendo o conceito de classes e objetos

- **Classe:** É o "molde" ou a planta arquitetônica. Define quais características e comportamentos os objetos criados a partir dela terão.
- **Objeto:** É a instância da classe. É o que "ganha vida" na memória.

*Exemplo da vida real:* A classe é o projeto de um carro, enquanto o objeto é o próprio carro na garagem.

---

## Criando uma classe com atributos

Atributos são as características (ou estado) de um objeto.

```java
public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoFabricacao;
}
```

> 💡 O nome da classe sempre deve começar com letra maiúscula (PascalCase), enquanto os atributos devem seguir o padrão `camelCase`.

---

## Instanciando objetos

Instanciar significa criar um objeto na memória baseado em uma classe. Usamos a palavra reservada `new`.

```java
Carro meuCarro = new Carro();
```

---

## Acessando atributos de objetos

Para acessar e modificar os atributos de um objeto instanciado, utilizamos o operador ponto (`.`).

```java
meuCarro.fabricante = "Ford";
meuCarro.modelo = "Ka";
meuCarro.anoFabricacao = 2021;

System.out.println(meuCarro.modelo); // Imprime: Ka
```

---

## Conhecendo o diagrama de classes da UML

A UML (Unified Modeling Language) ajuda a desenhar e estruturar sistemas orientados a objetos. No diagrama de classes:

- O primeiro bloco é o **Nome da Classe**.
- O segundo bloco lista os **Atributos** (características).
- O terceiro bloco lista os **Métodos** (comportamentos).

---

## Composição de objetos

Composição é quando um objeto possui outro objeto como atributo. Isso cria uma relação do tipo "tem um". 

```java
public class Pessoa {
    String nome;
    String cpf;
}

public class Carro {
    String modelo;
    Pessoa proprietario; // Composição: Um carro "tem um" proprietário (Pessoa)
}
```

Acessando os dados compostos:
```java
Carro meuCarro = new Carro();
meuCarro.proprietario = new Pessoa();
meuCarro.proprietario.nome = "Gustavo";
```

> 💡 O plugin **Java Visualizer** no IntelliJ é excelente para ver como a composição fica estruturada na memória (Heap Memory)!

## Aula 05.09 - Atribuindo o objeto da composição
Quando utilizamos composição de objetos, o objeto referenciado precisa ser instanciado antes de tentarmos acessar suas propriedades, ou ocorrerá um NullPointerException.

## Aula 05.10 - Conhecendo o diagrama de classes da UML
O diagrama de classes fornece uma representação visual da estrutura do sistema. Usamos retângulos para representar classes e linhas para representar associações/composições. O StarUML é uma das ferramentas utilizadas para criá-los.
