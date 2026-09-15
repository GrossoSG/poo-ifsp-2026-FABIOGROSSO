# Exercícios de revisão - Parte I

## Roteiro de Atividades

- Nome: Fabio Grosso Lira  
- Data: 15/09

### Atividade 1: O primeiro passo do encapsulamento
    1. _Porque private significa que o atributo só pode ser acessado diretamente dentro da própria classe. E não de maneira externa._
    2. _Evita que o preço seja mudado pra um valor inválido._
    3. 
    _Prompt: Porque a linguagem Java não permite, por padrão, que atributos fiquem públicos em código profissional, e quais problemas de manutenção isso costuma causar em sistemas grandes. Resposta curta.
    Resposta da IA: Java até permite atributos públicos, mas em código profissional isso é evitado porque qualquer parte do sistema poderia alterar os dados diretamente. Em sistemas grandes, isso dificulta validações, aumenta erros e torna a manutenção mais difícil.
    Minha Resposta: É importante o uso de atributos privados em Java, pois evita a alteração de dado diretamente que as vezes tem validações específicas.
    
    
### Atividade 2: Criando getters e setters
    1. _Sim, alterou para 0._
    2. _Pois o Setter tem as regras necessárias dos valores permitidos_
    3. _Com o this._
    4. 
    _Prompt: quais validações costumam ser adicionadas em setters de sistemas reais (ex: e-commerce, sistemas bancários) além de checar valores negativos.
    Resposta da IA: 
        Além de impedir valores negativos, setters reais costumam validar coisas como valor nulo, texto vazio, tamanho máximo, formato correto e limites permitidos.
        Exemplos: e-commerce pode impedir estoque negativo ou preço acima de um limite absurdo; sistema bancário pode validar CPF, saldo, limite de transferência, senha e dados obrigatórios.
    Minha Resposta: Setters validam o vazio de várias maneiras, como valor nulo. Assim em vários exemplos é possível evitar valores que passam do limite, são negstivos etc._
    
### Atividade 3: O operador this resolvendo conflito de nomes
    1. _Retornou 0 e null. Pois, ambos tem o mesmo nome e não teve o this que indica o atributo do parâmetro da classe._
    2. _Quando ambos tem o mesmo nome._
    3.
    _Prompt: Relacione o erro de não colocar o this quando os atributos do construtor e da classe possuem o mesmo nome, com o conceito de "escopo de variável"(shadowing) de maneira simples.
    Resposta da IA: Quando o parâmetro tem o mesmo nome do atributo, ele “esconde” o atributo dentro daquele escopo. Por isso, usamos this para indicar que queremos acessar o atributo da classe, e não o parâmetro. Shadowing é justamente quando uma variável mais interna “esconde” outra com o mesmo nome.
    Minha Resposta: O this resolve o problema com o shadowing (quando uma variável esconde outra com o mesmo nome)._
    
### Atividade 4: Construtor padrão x construtor parametrizado
    1. _Porque a classe já possuía um construtor criado manualmente._
    2. _Assim que o programador declara qualquer construtor na classe, com ou sem parâmetros._
    3.
    _Prompt: o que é o "construtor padrão implícito"gerado pelo compilador Java e em quais condições exatas ele deixa de existir.
    Resposta da IA: É um construtor sem parâmetros que o compilador cria automaticamente quando você não escreveu nenhum construtor:
        public Livro() {
        }
        Ele só existe automaticamente quando nenhum construtor foi declarado pelo programador. Se você criar até mesmo um único construtor, como:
        public Livro(String titulo) {
        }   
        o construtor implícito deixa de ser criado.
    Minha Resposta: É um construtor que o Java já cria sem parâmetros. Pra existir, não pode existir um contrutor já criado._
    
### Atividade 5: Sobrecarregando construtores
    1. _Com o parâmetro que foi colocado._
    2. _Fala que já existe, pois realmente já existe o construtor com um parâmetro de um atributo double._
    3.
    _Prompt: Por que a assinatura de um método/construtor não considera o nome dos parâmetros, apenas seus tipos e quantidade? De um exemplo de sobrecarga que causa ambiguidade de maneira curta.
    Resposta da IA: Porque o Java identifica um método/construtor pela **quantidade, ordem e tipos dos parâmetros**, não pelos nomes, já que os nomes só servem dentro do método.
        Exemplo ambíguo/inválido: 
        public Livro(String titulo, int paginas) { }
        public Livro(String nome, int quantidade) { }
        Mesmo com nomes diferentes, ambos têm assinatura:
        Livro(String, int)
        Então o Java considera que são o mesmo construtor e dá erro.
    Minha Resposta: Porque o Java identifica o construtor pela quantidade, ordem e tipos dos parâmetros, não pelos nomes.
    
### Atividade 6: Encadeando construtores com this()
    1. _O erro é java: call to this must be first statement in constructor_
    2. _O código ficou mais curto, simples, logo menos processamento._
    3.
    _Prompt: Por que this() precisa obrigatoriamente ser a primeira instrução do construtor e o que o compilador Java faz "por trás dos panos"quando um objeto é criado. Resposta simples.
    Respsta da IA: this() precisa ser a primeira instrução porque ele chama outro construtor da mesma classe, e essa inicialização precisa acontecer antes do restante do construtor atual. Por trás dos panos, ao usar new, o Java:
    1. Reserva memória para o objeto.
    2. Inicializa os atributos com valores padrão (0, null, false etc.).
    3. Chama o construtor — começando por this() ou super().
    4. Executa o restante das instruções do construtor.
    Por isso o Java não permite executar código antes de this().
    Minha Resposta: A primeira instrução deve ser chamar o outro construtor da mesma classe, pois o Java primeiro reserva, depois atribui os valores nulos e aí é chamado o construtor pra executar. A instrução de chamar deve ser lida logo._

### Atividade 7: Construtor de cópia usando this()
    1. _Porque foi declarado como 2 objetos diferentes, o p2 só herdou os atributos do p1 inicial._
    2. _Porque private impede acesso por outras classes, mas objetos da própria classe podem acessar atributos privados de outros objetos._
    3.
    _Prompt: por que um construtor de cópia é útil na prática e qual a diferença entre copiar um objeto e copiar apenas a referência? (Pessoa p2 = p1;).
    Repsosta da IA: Um construtor de cópia é útil quando você quer criar um novo objeto com os mesmos dados, mas que possa ser alterado sem afetar o original.
        Pessoa p2 = new Pessoa(p1);
        Cria outro objeto.
        Já:
        Pessoa p2 = p1;
        copia apenas a referência, então p1 e p2 apontam para o mesmo objeto. Se alterar por    p2, a mudança também aparece em p1.
    Minha Resposta: Um construtor de cópia é importante, pois é possível criar um novo objeto com os mesmos dados (se for preciso) e depois só mudar o que precisa.
    
### Atividade 8: Sobrecarregando métodos comuns
    1. _Os parâmetros._
    2. _Da erro pois fala que já é definido esse método._
    3. 
    _Prompt: Resposta simples: Por que o tipo de retorno sozinho não é suficiente para diferenciar métodos sobrecarregados em Java.
    Resposta da IA: Porque o Java diferencia métodos pelos **parâmetros**, não pelo tipo de retorno. Se os parâmetros forem iguais, ele considera os métodos iguais.
    Minha Resposta: Pois o Java diferencia métodos pelos parâmetros_
    
### Atividade 9: Sobrecarga com varargs
    1. _Ele não reclamou da ambiguidade._
    2. _Como um array._
    3.
    _Prompt: Qual é a ordem de prioridade que o Java usa para escolher entre um método sobrecarregado "exato" e um método com varargs quando ambos poderiam atender à chamada. Responda de maneira simples.
    Resposta da IA: O Java prefere primeiro o método com correspondência **exata dos parâmetros**. O método com `varargs` só é escolhido se não houver uma opção mais específica.
    Minha Resposta: Ele prioriza o método com correspondência exata dos parâmetros. Neste exemplo foi o com exatamente 2 atributos_

### Atividade 10: Integrando tudo, a classe ContaBancaria
    1. O this diferenciou os atributos dos parâmetros, o this(...) chamou outro construtor e, no depositar, o this indicou os atributos do próprio objeto.
    2. isAtiva() é uma convenção usada para getters booleanos. O funcionamento é o mesmo de um getter normal.
    3.
    _Prompt: Em uma classe ContaBancaria com saldo, titular e estado ativo, qual validação extra um sistema bancário real poderia aplicar nos métodos depositar ou sacar? Responda de maneira simples.
    Resposta da IA: Um sistema bancário poderia limitar o valor máximo de depósitos ou saques e impedir saques maiores que o saldo disponível.
    Minha Resposta: Poderia impedir saques maiores que o saldo e limitar valores muito altos de depósitos ou saques._
