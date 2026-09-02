# Arrays, matrizes, ArrayList

## Roteiro de Atividades

- Nome: Fabio Grosso Lira  
- Data: 25/08

### Atividade 2: Arrays e matrizes: leitura, agregação e percurso

a. _O laço aninhado não era necessário, pois só precisamos dos elementos em que "i == j". Um único laço é mais simples e eficiente._

b. _Porque "valores[0]" é um valor real do array. Assim, funciona corretamente mesmo se todos os números forem negativos._

c. _Prompt: Em um exercicio de percorrer laços em uma matriz e calcular a soma, eu coloquei um for que percorre i e o outro em j+1. Aparece (ArrayIndexOutOfBoundsException). O que isso significa nesse contexto? Resposta direta explicando.

    Resposta;
    `ArrayIndexOutOfBoundsException` significa que o programa tentou acessar uma posição que **não existe na matriz**.

    Nesse caso, ao usar `j + 1`, quando `j` chega na última coluna, `j + 1` ultrapassa o limite do array.

    Exemplo: se a matriz tem 3 colunas, os índices válidos são `0, 1, 2`. Se `j = 2`, então `j + 1 = 3`, e a posição `3` não existe._
