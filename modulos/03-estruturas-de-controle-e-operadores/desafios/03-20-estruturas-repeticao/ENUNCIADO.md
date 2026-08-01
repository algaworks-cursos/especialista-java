# 03.20 — Desafio: Estruturas de Repetição

Este desafio tem **5 partes**, cada uma abordando uma estrutura de repetição diferente.

---

## Parte 1 — Estrutura `for` (básico)

Escreva um programa que solicita **10 números** para o usuário e imprime na saída a **soma** dos números digitados.

**Regra:** Permita que o usuário digite apenas números **pares**. Caso um número ímpar seja informado, ignore e solicite um novo número ao usuário.

**Arquivo:** [Desafio1.java](./Desafio1.java)

---

## Parte 2 — Estrutura `for` (intermediário)

Escreva um programa que solicita um **número inteiro positivo** para o usuário e imprime na saída uma mensagem dizendo se o número digitado é um **número primo** ou não.

### O que é número primo?
Números primos são números naturais que possuem dois divisores: 1 e ele mesmo.

- O número **1** não é primo (tem apenas 1 divisor)
- O número **2** é primo (divisível por 1 e por 2)
- O número **4** não é primo (divisível por 1, 2 e 4)

**Dica:** Para saber se um número é divisível por outro, use o operador de módulo (`%`) e verifique se o resultado é igual a 0.

**Arquivo:** [Desafio2.java](./Desafio2.java)

---

## Parte 3 — Estrutura `while` (básico)

Escreva um programa que solicita **números inteiros** ao usuário de forma contínua e **soma** todos os números informados.

O programa deve parar de solicitar mais números e imprimir a soma na saída apenas quando o valor total somado for **igual ou superior a 100**.

**Arquivo:** [Desafio3.java](./Desafio3.java)

---

## Parte 4 — Estrutura `while` (intermediário)

Escreva um programa que solicita um **número inteiro** para o usuário e imprime na saída o número com os **dígitos invertidos**.

**Exemplo:**
```
Entrada: 98765
Saída:   56789
```

Este é um exercício intermediário — é possível fazer apenas com um loop e cálculos matemáticos (sem converter para String).

**Arquivo:** [Desafio4.java](./Desafio4.java)

---

## Parte 5 — Estrutura `do-while`

Escreva um programa que solicita **números inteiros** para o usuário de forma "infinita", até que o usuário escolha não digitar mais nenhum número (pergunte ao usuário após cada número informado).

Some todos os **números ímpares** e todos os **números pares** separadamente e imprima os dois resultados na saída.

**Arquivo:** [Desafio5.java](./Desafio5.java)
