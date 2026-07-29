# 03.04 — Desafio: Operadores de Igualdade e Lógicos

## Descrição

Você sabia que existem anos no calendário com 365 dias e outros com 366 dias?

Os anos com 366 dias são chamados de **anos bissextos**.

Isso acontece para manter o calendário anual ajustado com a translação do planeta Terra e com os eventos sazonais relacionados às estações do ano.

## Regras para ano bissexto

- São bissextos todos os anos **múltiplos de 400**, por exemplo: 1600, 2000, 2400...
- São bissextos todos os **múltiplos de 4 e não múltiplos de 100**, por exemplo: 1996, 2004, 2008, 2012...
- **Não** são bissextos todos os demais anos

## Requisitos

Desenvolva um programa que, dado um ano digitado pelo usuário, imprime na tela se é um ano bissexto ou não.

## Dica de matemática

Para saber se um número é múltiplo de outro, basta realizar o cálculo de **módulo** (resto da divisão). Um número é múltiplo de outro se o módulo for igual a 0.

```
2000 % 400 == 0  → múltiplo de 400 → bissexto!
1900 % 400 != 0  → não é múltiplo de 400
1900 % 4   == 0  → é múltiplo de 4
1900 % 100 == 0  → mas é múltiplo de 100 → não bissexto!
```

## Exemplo de saída

```
Entre com o ano: 2000
O ano é bissexto: true

Entre com o ano: 1900
O ano é bissexto: false

Entre com o ano: 2024
O ano é bissexto: true
```

## Arquivo

- [VerificaAnoBissexto.java](./VerificaAnoBissexto.java)
