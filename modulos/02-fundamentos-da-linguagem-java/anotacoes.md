# Anotações — Módulo 02: Fundamentos da Linguagem Java

## Primeiro Programa

Todo programa Java precisa de uma classe pública com o método `main`. Esse método é o ponto de entrada — é por onde a JVM começa a executar.

```java
public class OlaMundo {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");
    }
}
```

> 💡 O nome do arquivo `.java` **deve ser igual** ao nome da classe pública. Faz distinção entre maiúsculas e minúsculas!

---

## Comentários

Existem três formas de comentar em Java:

```java
// Comentário de uma linha

/* Comentário
   de múltiplas linhas */

/**
 * Comentário Javadoc — usado para documentar classes e métodos
 */
```

---

## Convenções de Código (Java Code Conventions)

Seguir convenções é importante para manter o código legível por todos.

| Elemento | Convenção | Exemplo |
|----------|-----------|---------|
| Classe | PascalCase | `MinhaClasse` |
| Variável | camelCase | `minhaVariavel` |
| Constante | UPPER_SNAKE_CASE | `VALOR_MAXIMO` |
| Método | camelCase | `calcularSoma()` |
| Pacote | tudo minúsculo | `com.empresa.projeto` |

---

## Variáveis

Variável é um "espaço na memória" com um nome e um tipo. Em Java, é necessário declarar o tipo antes de usar.

```java
// Declaração e inicialização
int idade = 25;
String nome = "Gustavo";
double salario = 3500.50;

// Declaração sem inicialização (pode fazer, mas não pode usar antes de inicializar)
int x;
x = 10;
```

**Regras para nomes de variáveis:**
- Começar com letra, `_` ou `$`
- Sem espaços
- Não pode ser palavra reservada (`int`, `class`, `for`...)
- Case-sensitive: `idade` ≠ `Idade`

---

## Operadores Aritméticos

| Operador | Operação | Exemplo |
|----------|----------|---------|
| `+` | Adição | `5 + 3 = 8` |
| `-` | Subtração | `5 - 3 = 2` |
| `*` | Multiplicação | `5 * 3 = 15` |
| `/` | Divisão | `7 / 2 = 3` (inteira!) |
| `%` | Módulo (resto) | `7 % 2 = 1` |

> ⚠️ **Cuidado com divisão inteira!** `7 / 2` resulta em `3`, não `3.5`. Para obter decimais, ao menos um dos operandos deve ser `double` ou `float`.

### Abreviando operadores

```java
x = x + 5;  // equivalente a:
x += 5;

x = x * 2;  // equivalente a:
x *= 2;
```

### Incremento e Decremento

```java
x++;  // pós-incremento: usa o valor atual, depois incrementa
++x;  // pré-incremento: incrementa primeiro, depois usa

int a = 5;
int b = a++;  // b = 5, a = 6
int c = ++a;  // a = 7, c = 7
```

---

## Tipos Primitivos

Java tem 8 tipos primitivos:

| Tipo | Tamanho | Faixa de valores | Uso |
|------|---------|------------------|-----|
| `byte` | 8 bits | -128 a 127 | Raro |
| `short` | 16 bits | -32.768 a 32.767 | Raro |
| `int` | 32 bits | ~-2 bi a ~2 bi | Inteiros no geral |
| `long` | 64 bits | muito grande | Inteiros grandes, usar `L` no final |
| `float` | 32 bits | ~7 dígitos decimais | Ponto flutuante, usar `f` no final |
| `double` | 64 bits | ~15 dígitos decimais | Padrão para decimais |
| `char` | 16 bits | caractere Unicode | Um único caractere |
| `boolean` | — | `true` ou `false` | Verdadeiro/Falso |

```java
long populacaoMundial = 8_000_000_000L;  // O L é obrigatório para long grande
float altura = 1.75f;                     // O f é obrigatório para float
double pi = 3.14159265358979;
char letra = 'A';
boolean ativo = true;
```

> 💡 O `_` (underscore) pode ser usado em literais numéricos para facilitar a leitura. `1_000_000` = um milhão.

---

## Conversão de Tipos Primitivos

### Widening (implícita — sem risco de perda)
```java
int x = 100;
long y = x;      // OK! int cabe em long
double z = x;    // OK! int cabe em double
```

### Narrowing (explícita — pode perder dados, precisa de cast)
```java
double d = 3.99;
int i = (int) d;  // i = 3 (trunca, não arredonda!)
```

> ⚠️ O **cast** trunca o valor, não arredonda. `(int) 3.99` vira `3`.

---

## Promoção Aritmética

Quando operamos com tipos diferentes, Java faz uma "promoção" automaticamente:

1. Se algum operando é `double` → resultado é `double`
2. Se algum operando é `float` → resultado é `float`
3. Se algum operando é `long` → resultado é `long`
4. Caso contrário → resultado é `int` (até `byte` e `short` viram `int` em operações!)

```java
int x = 10;
long y = 5;
long resultado = x * y;  // x é promovido para long

byte a = 10;
byte b = 20;
// byte c = a + b;  // ERRO! a + b resulta em int
int c = a + b;     // OK
```

---

## String

`String` não é um tipo primitivo — é uma **classe** em Java, mas tem algumas facilidades especiais.

```java
String nome = "Gustavo";

// Concatenação com +
String saudacao = "Olá, " + nome + "!";

// Métodos úteis
nome.length();           // tamanho da string
nome.toUpperCase();      // "GUSTAVO"
nome.toLowerCase();      // "gustavo"
nome.contains("usta");   // true
nome.replace("a", "o");  // "Gustovo"
```

> ⚠️ Para comparar strings, use `.equals()` e **não** `==`. O `==` compara referências de objeto (endereço de memória), não o conteúdo.

```java
String s1 = new String("Java");
String s2 = new String("Java");
s1 == s2      // false! (referências diferentes)
s1.equals(s2) // true (conteúdo igual)
```

---

## Sequências de Escape

Usadas dentro de strings para representar caracteres especiais:

| Escape | Significado |
|--------|-------------|
| `\n` | Nova linha |
| `\t` | Tab horizontal |
| `\"` | Aspas duplas |
| `\\` | Barra invertida |
| `\r` | Retorno de carro |

```java
System.out.println("Linha 1\nLinha 2");
System.out.println("Caminho: C:\\Windows");
System.out.println("Ela disse: \"Olá!\"");
```

---

## Formatando com printf

O `printf` permite formatar a saída com precisão:

```java
System.out.printf("Nome: %s%n", nome);
System.out.printf("Idade: %d%n", idade);
System.out.printf("Salário: R$%.2f%n", salario);
System.out.printf("Nota: %6.2f%n", nota);  // 6 posições, 2 decimais
```

| Especificador | Tipo |
|---------------|------|
| `%s` | String |
| `%d` | Inteiro |
| `%f` | Ponto flutuante |
| `%.2f` | Ponto flutuante com 2 casas |
| `%b` | Boolean |
| `%n` | Nova linha (multiplataforma) |

---

## Entrada de Dados com Scanner

```java
import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.printf("Olá, %s! Você tem %d anos e %.2fm de altura.%n",
            nome, idade, altura);
    }
}
```

> 💡 **Dica importante:** Depois de `nextInt()` ou `nextDouble()`, o `\n` da tecla Enter fica no buffer. Se depois você usar `nextLine()`, ele vai ler o Enter em branco. Para evitar isso, adicione um `entrada.nextLine()` extra após os métodos numéricos.
