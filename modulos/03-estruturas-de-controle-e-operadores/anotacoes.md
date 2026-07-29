# Anotações — Módulo 03: Estruturas de Controle e Operadores

## Operadores de Igualdade e Negação

### Igualdade e diferença
```java
boolean iguais = 10 == 10;    // true
boolean diferentes = 10 != 5; // true
```

### Negação unária (`!`)
Inverte um valor boolean:
```java
boolean logado = true;
boolean naoLogado = !logado;  // false
```

> ⚠️ Para comparar `String`, **nunca use `==`** — use `.equals()`. O `==` em String compara referências de memória, não o valor.

---

## Operadores de Comparação

| Operador | Significado |
|----------|-------------|
| `>` | Maior que |
| `<` | Menor que |
| `>=` | Maior ou igual |
| `<=` | Menor ou igual |

Sempre retornam `boolean`:
```java
int peso = 1000;
int limite = 1000;
boolean excedeu = peso > limite;   // false
boolean liberado = peso <= limite; // true
```

---

## Operadores Lógicos

Combinam expressões booleanas:

| Operador | Nome | Resultado |
|----------|------|-----------|
| `&&` | AND (E) | `true` só se **ambos** forem `true` |
| `\|\|` | OR (OU) | `true` se **pelo menos um** for `true` |
| `!` | NOT (NÃO) | inverte o valor |

### Curto-circuito
Uma coisa interessante: o Java usa **avaliação de curto-circuito**:
- `&&`: se o primeiro for `false`, o segundo **nem é avaliado** (já sabe que o resultado é `false`)
- `||`: se o primeiro for `true`, o segundo **nem é avaliado** (já sabe que o resultado é `true`)

Isso importa quando o segundo operando tem algum efeito colateral ou pode causar erro.

### Precedência dos operadores lógicos
`!` tem maior precedência que `&&`, que tem maior precedência que `||`.

```java
// Essa expressão:
x == 13 && x == 15 || y == 20
// É avaliada como:
(x == 13 && x == 15) || y == 20
// Não como:
x == 13 && (x == 15 || y == 20)
```

Quando tiver dúvida, use parênteses — deixa mais claro e evita bugs chatos.

---

## Estrutura Condicional if

```java
if (condicao) {
    // executa se condição for true
} else if (outraCondicao) {
    // executa se outraCondicao for true
} else {
    // executa se nenhuma das anteriores for true
}
```

> 💡 Se o bloco tem só uma instrução, as chaves são opcionais — mas prefiro sempre colocar para evitar bugs ao adicionar mais linhas depois.

### Escopo de variáveis
Variáveis declaradas dentro de um bloco `if` só existem dentro dele:
```java
if (ativo) {
    String mensagem = "Usuário ativo";
    System.out.println(mensagem);
}
// System.out.println(mensagem); // ERRO! mensagem não existe aqui
```

---

## Estrutura switch

Útil para comparar uma variável com múltiplos valores fixos:

### switch tradicional (com break)
```java
switch (diaSemana) {
    case "seg":
        horario = "Fechado";
        break;
    case "ter":
    case "qua":
        horario = "08:00 às 18:00";
        break;
    default:
        horario = "Inválido";
}
```

> ⚠️ O `break` é essencial! Sem ele, o código "cai" no próximo case (fall-through).

### switch expression (Java 14+) — bem mais elegante!
```java
String horario = switch (diaSemana) {
    case "seg" -> "Fechado";
    case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
    case "sab", "dom" -> "08:00 às 12:00";
    default -> "Dia inválido";
};
```

A versão com `->` não precisa de `break` e pode retornar um valor diretamente. Muito mais limpo!

---

## Operador Ternário

Forma compacta de escrever um if/else simples:

```java
// Estrutura: condição ? valorSeTrue : valorSeFalse
String status = peso > limite ? "Excedido" : "Liberado";
```

É ótimo para atribuições simples, mas não abuse — se ficar complexo demais, prefira o if/else normal por clareza.

---

## Estruturas de Repetição

### for — quando sei quantas vezes repetir
```java
for (int i = 0; i < 10; i++) {
    System.out.println("Iteração: " + i);
}
// Estrutura: (inicialização; condição; atualização)
```

### while — enquanto uma condição for verdadeira
```java
int tentativas = 0;
while (tentativas < 3) {
    System.out.println("Tentativa " + tentativas);
    tentativas++;
}
```

### do-while — executa pelo menos uma vez, depois verifica
```java
int numero;
do {
    System.out.print("Digite um número positivo: ");
    numero = entrada.nextInt();
} while (numero <= 0);
```

> 💡 Use `do-while` quando o bloco precisa executar ao menos uma vez antes da verificação — como pedir entrada do usuário e validar depois.

---

## Cláusulas break e continue

- **`break`**: sai imediatamente do loop (ou switch)
- **`continue`**: pula para a próxima iteração do loop

```java
for (int i = 0; i < 10; i++) {
    if (i == 3) continue;  // pula o 3
    if (i == 7) break;     // para no 7
    System.out.println(i); // imprime: 0, 1, 2, 4, 5, 6
}
```

---

## Resumo de Quando Usar Cada Loop

| Situação | Loop recomendado |
|----------|-----------------|
| Quantidade de iterações conhecida | `for` |
| Condição de parada baseada em estado | `while` |
| Precisa executar ao menos uma vez | `do-while` |
| Percorrer coleção (aprenderemos depois) | `for-each` |

---

## Dicas que aprendi nesse módulo

1. **Sempre use parênteses** em expressões lógicas complexas — evita bugs de precedência
2. **Prefira switch expression** (com `->`) ao switch tradicional quando possível — código mais limpo e sem risco de esquecer o `break`
3. **`continue`** pode deixar o código mais legível ao "inverter" condições (ao invés de aninhar `if` dentro do loop)
4. O `do-while` é subestimado mas muito útil para menus interativos e validações de entrada
