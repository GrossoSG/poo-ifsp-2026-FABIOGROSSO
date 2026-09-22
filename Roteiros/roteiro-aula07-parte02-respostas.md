# Exercícios de revisão - Parte 2

## Roteiro de Atividades

- Nome: Fabio Grosso Lira  
- Data: 20/09

### Atividade 1: Validando um cadastro com String
    1. _Retorna uma nova String. Confirmei porque foi necessário fazer nomeDigitado = nomeDigitado.trim();._
    2. _Porque `"   "` antes do `trim()` não está vazia; depois vira `""` e o `isEmpty()` retorna `true`._
    3. 
    _Prompt: Por que String é uma classe imutável em Java e o que isso implica para métodos como trim(), toUpperCase() e replace(). Resposta curta.
    Resposta da IA: `String` é imutável porque seu conteúdo não pode ser alterado após a criação. Métodos como `trim()`, `toUpperCase()` e `replace()` retornam uma nova `String`, sem modificar a original.
    Minha Resposta: String é imutável, então seu valor original não muda. Métodos como trim(), toUpperCase() e replace() criam e retornam uma nova String._

### Atividade 2: Extraindo informações de um e-mail

    1. _indexOf('@') retorna -1. Nesse caso, o substring() usaria um índice inválido e causaria uma exceção._
    2. _substring(indice) pega do índice até o final, enquanto substring(0, indice) pega do início até antes do índice._
    3.
    _Prompt: Quais exceções o método substring pode lançar em Java e em quais condições? Dê um exemplo de índice inválido. Resposta curta.
    Resposta da IA: O substring() pode lançar StringIndexOutOfBoundsException quando o índice é negativo, maior que o tamanho da String ou quando o índice inicial é maior que o final. Exemplo: "Java".substring(5).
    Minha Resposta: O substring() lança StringIndexOutOfBoundsException quando recebe índices inválidos, como "Java".substring(5), pois a String só tem 4 caracteres._

### Atividade 3: Comparando e quebrando uma linha de dados (CSV)

    1. _linha.equals(outraLinha) retorna false, pois diferencia letras maiúsculas de minúsculas. Já equalsIgnoreCase() retorna true, pois ignora essa diferença._
    2. _Usando ==, o resultado foi false. O == compara se as duas variáveis apontam para o mesmo objeto, enquanto equals() compara o conteúdo das Strings._

### Atividade 4: Criando a classe Produto e um ArrayList de produtos

    1. _Porque ArrayList<Produto> garante que cada item da lista é um Produto, então podemos chamar getPreco() diretamente sem precisar converter o tipo._
    2. _Não muito, porque ListaDeCompras depende da classe Produto para funcionar. Isso mostra uma relação de dependência entre as duas classes._

### Atividade 5: Criando a classe Aluno e calculando estatísticas com ArrayList

    1. _Se a turma estiver vazia, calcularMedia() retorna 0 para evitar divisão por zero._
    2. _Porque precisamos retornar o objeto Aluno completo, não apenas a maior nota._
    3.
    _Prompt: Como o método encontrarMelhorAluno() poderia ser reescrito usando Streams do Java com stream() e max()? Compare com a versão usando for. Resposta curta.
    Resposta da IA: Com Streams, é possível usar stream().max() com um Comparator para encontrar o aluno de maior nota. A versão com for é mais simples para iniciantes, enquanto Streams deixa o código mais compacto.
    Minha Resposta: Com Streams dá para usar max() para pegar o aluno com maior nota. O for é mais fácil de entender, e Streams é mais curto._
