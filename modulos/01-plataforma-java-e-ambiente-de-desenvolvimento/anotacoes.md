# Anotações — Módulo 01: Plataforma Java e Ambiente de Desenvolvimento

## O que é Java?

Java é uma linguagem de programação **orientada a objetos** criada pela Sun Microsystems em 1995, hoje mantida pela Oracle. É uma das linguagens mais populares do mundo, usada em aplicações web, mobile (Android), sistemas corporativos e muito mais.

O lema histórico do Java é: **"Write once, run anywhere"** — escreva o código uma vez e execute em qualquer plataforma.

---

## JDK, JRE e JVM — qual a diferença?

Essa parte me confundiu no começo, então tentei esquematizar:

```
JDK (Java Development Kit)
├── JRE (Java Runtime Environment)
│   └── JVM (Java Virtual Machine)
│       └── executa o bytecode
└── Ferramentas de desenvolvimento
    ├── javac  → compilador Java
    ├── java   → executa programas
    └── jshell → REPL interativo
```

- **JVM** → a máquina virtual que executa os programas Java. É ela que faz o Java rodar em qualquer sistema operacional
- **JRE** → o ambiente de execução. Tem a JVM + bibliotecas padrão. Só serve para *rodar* programas
- **JDK** → o kit completo para *desenvolver*. Tem o JRE + compilador + outras ferramentas

> 💡 **Resumo prático:** Para programar, preciso do **JDK**. Para só executar, bastaria o JRE — mas hoje o JRE separado não é mais distribuído, então instalamos o JDK mesmo.

---

## Como o Java funciona?

O Java tem um processo diferente de linguagens como C (que compila direto para código de máquina):

```
Código-fonte (.java)
        ↓ javac (compilador)
     Bytecode (.class)
        ↓ JVM (interpreta/compila JIT)
   Código de máquina (executado pelo SO)
```

1. Escrevo o código em `.java`
2. O `javac` compila para **bytecode** (arquivo `.class`)
3. A JVM lê o bytecode e executa — e ela existe para Windows, Linux, Mac...
4. Por isso o mesmo `.class` roda em qualquer plataforma que tenha JVM instalada

---

## Plataformas Java

| Plataforma | Nome | Para que serve |
|------------|------|----------------|
| **Java SE** | Standard Edition | Aplicações desktop e fundamentos da linguagem |
| **Java EE / Jakarta EE** | Enterprise Edition | Aplicações web e corporativas |
| **Java ME** | Micro Edition | Dispositivos com poucos recursos (embarcados) |

No curso, trabalhamos com **Java SE**, que é a base de tudo.

---

## Versões LTS do Java

As versões **LTS** (Long-Term Support) recebem suporte por um longo período — são as versões seguras para usar em produção.

Principais versões LTS:
- **Java 8** — muito ainda em uso legado
- **Java 11** — LTS anterior
- **Java 17** — LTS atual quando o curso foi criado
- **Java 21** — LTS mais recente (2023)

No curso usamos **Java 17**, mas o instrutor destaca quando usa recursos exclusivos de versões mais recentes.

---

## Ferramentas

### IntelliJ IDEA
IDE desenvolvida pela JetBrains. É a mais popular para desenvolvimento Java atualmente. Tem versão **Community** (gratuita) que serve muito bem para o curso.

Atalhos que comecei a usar:
- `Shift + F10` → executar o programa
- `psvm` + Tab → gera o `public static void main`
- `sout` + Tab → gera o `System.out.println`
- `Ctrl + /` → comentar/descomentar linha

### JShell
REPL (Read-Eval-Print Loop) do Java, disponível desde o Java 9. Permite testar código Java de forma interativa no terminal, sem precisar criar uma classe completa. Muito útil para testar expressões rápidas.
