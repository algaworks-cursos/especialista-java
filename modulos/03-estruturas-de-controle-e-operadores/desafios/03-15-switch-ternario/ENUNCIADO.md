# 03.15 — Desafio: Estrutura Switch e Operador Ternário

## Descrição

Uma financeira contratou um programador para desenvolver um programa que calcula o custo total de empréstimos para seus clientes, porém o contrato foi cancelado e você foi chamado para concluir a programação do sistema.

## Código base (incompleto)

```java
import java.util.Scanner;

public class SimuladorEmprestimo {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Valor do empréstimo: ");
    double valorEmprestimo = entrada.nextDouble();

    System.out.print("Quantidade de parcelas: ");
    int quantidadeParcelas = entrada.nextInt();

    double taxaJuros = // switch expression aqui

    double tarifaFixa = // use operador ternário aqui
    double totalJuros = valorEmprestimo * (taxaJuros / 100 * quantidadeParcelas);
    double custoTotal = valorEmprestimo + tarifaFixa + totalJuros;

    System.out.printf("Tarifa fixa: R$%.2f%n", tarifaFixa);
    System.out.printf("Total de juros: R$%.2f%n", totalJuros);
    System.out.printf("Custo total: R$%.2f%n", custoTotal);
  }

}
```

## Regras de negócio

### Taxa de juros (use **switch expression**)
| Parcelas | Taxa de juros ao mês |
|----------|---------------------|
| 1 ou 2 parcelas | 1,99% |
| 3 parcelas | 2,99% |
| Outras quantidades | 3,99% |

### Tarifa fixa (use **operador ternário**)
- Se o valor do empréstimo for **maior ou igual a R$ 100,00** → tarifa fixa de **R$ 1,50**
- Caso contrário → sem tarifa fixa (R$ 0,00)

## Exemplo de saída

```
Valor do empréstimo: 500
Quantidade de parcelas: 3
Tarifa fixa: R$1,50
Total de juros: R$44,85
Custo total: R$546,35
```

## Arquivo

- [SimuladorEmprestimo.java](./SimuladorEmprestimo.java)
