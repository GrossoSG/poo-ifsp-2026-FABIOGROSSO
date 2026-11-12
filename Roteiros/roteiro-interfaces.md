# Herança

## Roteiro de Atividades

- Nome: Fabio Grosso Lira  
- Data: 29/10

### Atividade 1: Herança

    1. _O compilador apresenta erro, pois tenta chamar automaticamente super(), mas a classe Veiculo não possui um construtor sem parâmetros._
    2. _Nenhuma classe deixa de compilar no código atual, pois as subclasses não acessam placa diretamente. Caso precisem acessá-la, podemos criar um método getPlaca() público em Veiculo, mantendo o encapsulamento._
    
### Atividade 2: Polimorfismo

    1. _O Java utiliza o polimorfismo para executar a versão de enviar() correspondente ao tipo real do objeto, seja Email, Sms ou Notificacao._
    2. _Ocorre um erro ClassCastException durante a execução, pois um objeto Sms não pode ser convertido para Email._
    
### Atividade 3: Sobrescrita de toString, equals e hashCode

    1. _Porque, antes da sobrescrita, o HashSet comparava os objetos pela referência na memória, considerando-os diferentes. O equals() verifica a igualdade e o hashCode() deve gerar o mesmo código hash para objetos considerados iguais._
    2. _Se incluíssemos também o nome, dois produtos só seriam considerados iguais se tivessem o mesmo código e nome. Caso um dos atributos fosse diferente, seriam considerados objetos diferentes._

### Atividade 4: Interface Comparable e ordenação

    1. _Porque queremos ordenar as notas da maior para a menor. Se invertermos para Double.compare(this.nota, outro.nota), a ordenação será da menor para a maior._
    2. _Comparable define a ordenação padrão dos objetos dentro da própria classe. Comparator permite criar outras formas de ordenar sem modificar a classe._
    3. _Todos os alunos seriam considerados iguais na ordenação. Como a ordenação de listas do Java é estável, os alunos permaneceriam na ordem original._
    4. _É uma forma simplificada de fazer referência a um método existente. Por exemplo, Aluno::getNome indica que o método getNome() será utilizado para obter o nome dos alunos na ordenação._
    
### Atividade 5: Classe abstrata

    1. _Porque Conta é uma classe abstrata e não pode criar objetos diretamente. O construtor serve para inicializar os atributos comuns quando uma subclasse, como ContaCorrente, é criada._
    2. _A vantagem é reutilizar o código de cobrarTarifa() enquanto cada subclasse define sua própria tarifa. Se ambos fossem abstratos, cada subclasse teria que implementar os dois métodos._
