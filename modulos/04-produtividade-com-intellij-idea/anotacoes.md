# Anotações — Módulo 04: Produtividade com a IDE IntelliJ IDEA

## Por que usar uma IDE?

Antes do curso eu usava editor de texto simples mesmo, e compilava tudo na mão pelo terminal. A experiência é válida para entender o que acontece por baixo dos panos, mas na prática do dia a dia a IDE faz uma diferença enorme em produtividade.

A **IntelliJ IDEA** da JetBrains é hoje a IDE mais popular para Java. Existe em duas versões:
- **Community** — gratuita e open source, serve muito bem para o que o curso precisa
- **Ultimate** — paga, com suporte a frameworks web, banco de dados, etc.

---

## Configuração inicial

Algumas configurações que fiz logo de cara:
- Habilitar o **auto-import** para não precisar ficar importando classes na mão
- Configurar o JDK do projeto em `File > Project Structure > SDK`
- Instalar o plugin **Java Visualizer** — muito útil para visualizar objetos na memória durante o debug

---

## Code Completion

O IntelliJ tem um sistema de autocomplete muito poderoso. Tem dois modos:

- **Basic Completion** (`Ctrl + Space`) — sugestões básicas de contexto
- **Smart Completion** (`Ctrl + Shift + Space`) — sugestões baseadas no tipo esperado na expressão

Ele também completa nomes de variáveis automaticamente com base no tipo — se você cria um `Scanner`, ele já sugere `scanner` ou `entrada` como nome.

---

## Live Templates

Live Templates são atalhos de texto que expandem para blocos de código completos. São os snippets que salvam o dia!

Os mais usados que aprendi:

| Atalho | Expande para |
|--------|-------------|
| `psvm` + Tab | `public static void main(String[] args) {}` |
| `sout` + Tab | `System.out.println()` |
| `soutv` + Tab | `System.out.println("variavel = " + variavel)` |
| `fori` + Tab | Loop `for` com índice |
| `iter` + Tab | Loop `for-each` |
| `ifn` + Tab | `if (x == null) {}` |
| `inn` + Tab | `if (x != null) {}` |

Dá até para criar seus próprios Live Templates em `Settings > Editor > Live Templates`.

---

## Postfix Completion

Uma coisa que achei bem legal — você escreve a expressão e depois adiciona um sufixo para transformar ela em algo maior:

| Postfix | O que faz | Exemplo |
|---------|-----------|---------|
| `.if` | Envolve em if | `condicao.if` → `if (condicao) {}` |
| `.for` | Loop for-each | `lista.for` → `for (Tipo x : lista) {}` |
| `.sout` | println | `variavel.sout` → `System.out.println(variavel)` |
| `.var` | Cria variável | `new Scanner(System.in).var` → `var scanner = new Scanner(System.in)` |
| `.null` | Verificação null | `obj.null` → `if (obj == null) {}` |
| `.not` | Negação | `condicao.not` → `!condicao` |

---

## Atalhos mais importantes

### Navegação

| Atalho | Ação |
|--------|------|
| `Ctrl + N` | Ir para uma classe pelo nome |
| `Ctrl + Shift + N` | Ir para um arquivo pelo nome |
| `Ctrl + B` ou `Ctrl + Click` | Ir para a declaração de uma classe/método |
| `Alt + F7` | Encontrar todos os usos de uma classe/método |
| `Ctrl + E` | Arquivos recentes |
| `Ctrl + Shift + E` | Localizações recentes |
| `Shift Shift` (duas vezes) | Search Everywhere — busca qualquer coisa |

### Edição

| Atalho | Ação |
|--------|------|
| `Ctrl + D` | Duplicar linha |
| `Ctrl + Y` | Deletar linha |
| `Ctrl + /` | Comentar/descomentar linha |
| `Ctrl + Shift + /` | Comentário de bloco |
| `Ctrl + Alt + L` | Formatar o código (muito útil!) |
| `Shift + Alt + ↑/↓` | Mover linha para cima/baixo |
| `Ctrl + Shift + ↑/↓` | Mover bloco de código para cima/baixo |
| `Ctrl + Z` | Desfazer |
| `Ctrl + Shift + Z` | Refazer |

### Refatoração

| Atalho | Ação |
|--------|------|
| `Shift + F6` | Renomear (atualiza todas as referências!) |
| `Ctrl + Alt + M` | Extrair método |
| `Ctrl + Alt + V` | Extrair variável |
| `Ctrl + Alt + C` | Extrair constante |
| `Alt + Enter` | Quick Fix — aparece sugestões para resolver problemas |

### Build e Execução

| Atalho | Ação |
|--------|------|
| `Shift + F10` | Executar o programa |
| `Shift + F9` | Executar em modo debug |
| `Ctrl + F9` | Build do projeto |
| `Ctrl + Shift + F10` | Executar o arquivo/classe atual |

---

## Debugger

Essa parte foi reveladora. Eu costumava colocar `System.out.println` em tudo para tentar entender o que estava acontecendo no código. Com o Debugger, é muito mais poderoso.

### Conceitos básicos

**Breakpoint** — um ponto de parada no código. Clica na margem esquerda da linha e aparece um círculo vermelho. O programa vai parar nessa linha quando chegar lá em execução.

**Step Over** (`F8`) — executa a linha atual e vai para a próxima, sem entrar dentro de métodos chamados

**Step Into** (`F7`) — entra dentro do método chamado na linha atual

**Step Out** (`Shift + F8`) — sai do método atual e volta para quem chamou

**Resume** (`F9`) — continua a execução até o próximo breakpoint (ou até o fim)

### Tipos de breakpoints

- **Line Breakpoint** — o básico, para na linha especificada
- **Conditional Breakpoint** — para apenas quando uma condição é verdadeira (clica com botão direito no breakpoint para configurar). Muito útil quando o bug acontece só em iteração específica de um loop!
- **Silenced Breakpoint** — breakpoint desativado temporariamente

### Watches e Evaluate Expression

No painel do Debugger tem a aba **Watches** onde você pode adicionar expressões para monitorar durante a execução. Tipo, posso adicionar `lista.size()` e ver o tamanho da lista a cada passo.

O **Evaluate Expression** (`Alt + F8`) permite executar qualquer expressão Java no contexto atual — ótimo para testar hipóteses sem precisar alterar o código.

> 💡 O plugin **Java Visualizer** adiciona uma visualização gráfica dos objetos na memória durante o debug. É incrível para entender orientação a objetos — você vê os objetos apontando uns para os outros na memória em tempo real.

---

## Scratch Files

Scratch Files são arquivos temporários de rascunho que ficam fora do projeto. São perfeitos para testar pequenos trechos de código sem criar uma classe nova no projeto.

Para criar: `Ctrl + Alt + Shift + Insert` → Java

O arquivo fica salvo em `~/.config/JetBrains/.../scratches/` e persiste entre sessões.

---

## JShell Console

O IntelliJ tem uma integração com o JShell direto na IDE: `Tools > JShell Console`.

É como ter um REPL integrado — você pode testar expressões Java interativamente sem precisar criar um arquivo, compilar, executar... Ótimo para testar rapidamente como um método se comporta.

---

## EditorConfig

O EditorConfig é um arquivo `.editorconfig` na raiz do projeto que define regras de estilo de código — indentação, encoding, fim de linha, etc.

```ini
# .editorconfig
root = true

[*]
charset = utf-8
indent_style = space
indent_size = 2
end_of_line = lf
trim_trailing_whitespace = true
insert_final_newline = true

[*.java]
indent_size = 4
```

O IntelliJ respeita essas configurações automaticamente, então se todo o time tem o `.editorconfig` no projeto, o estilo fica consistente independente das configurações pessoais de cada um.

---

## Importando um projeto existente

Para importar um projeto Java já existente:
1. `File > Open` → selecionar a pasta do projeto
2. Ou `File > New > Project from Existing Sources`
3. Configurar o JDK do projeto em `File > Project Structure > Project SDK`

Se o projeto usa Maven: o IntelliJ detecta automaticamente o `pom.xml` e já configura as dependências.
