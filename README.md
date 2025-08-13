#  Calculadora Java no Terminal

Este é um projeto simples de uma **calculadora feita em Java**, executada via terminal. Ele permite realizar operações matemáticas básicas e foi desenvolvido com foco em praticar os fundamentos da linguagem.

---

# Funcionalidades

- Entrada de dois valores numéricos pelo usuário.
- Suporte às operações:
  - Adição (`+`)
  - Subtração (`-`)
  - Multiplicação (`*`)
  - Divisão (`/`)
- Tratamento de erros:
  - Entradas inválidas (não numéricas)
  - Divisão por zero
- Opção de realizar novas operações em sequência.

---

# Estrutura do Projeto

- `Main.java`: classe principal que gerencia a interação com o usuário e o fluxo do programa.
- `CalculadoraApp.java`: classe utilitária com métodos que realizam os cálculos e controlam a repetição do programa.

---

# Como Executar

1. Certifique-se de ter o **Java instalado** (recomenda-se JDK 17 ou superior).
2. Compile os arquivos no terminal:


`javac Main.java CalculadoraApp.java`

3. Execute o programa:


`Bash
java Main`


---

# Exemplo de Uso

1. Digite o primeiro valor: 
**10**

2. Digite a operação [+ , - , / , * ]: 
**+**

3. Digite o segundo valor: 
**5**

4. Resultado: 
**15.0**

5.Deseja realizar uma nova operação ?[Sim ou Não]:
**sim**


---

# Tratamento de Erros

Entradas não numéricas exibem a mensagem:

`Erro: os valores devem ser numéricos.`

Divisão por zero é impedida com a mensagem:

`Erro: não é possível dividir por zero.`



---

# Conceitos Aplicados

- Leitura de dados com Scanner

- Controle de fluxo com try-catch, do-while e switch

- Operadores lógicos e aritméticos

- Estruturação de métodos auxiliares



---

# Autor

Desenvolvido por [Thiago Rocha](https://github.com/thiagorocha1612) como parte dos estudos em Java e lógica de programação.
