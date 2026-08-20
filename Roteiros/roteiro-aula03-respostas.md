# Estruturas de controle. Wrappers e autoboxing

## Roteiro de Atividades

- Nome: Fabio Grosso Lira  
- Data: 05/08

### Atividade 1: Wrappers e autoboxing e a armadilha do ‘==‘

*a) O "==“ comparam se o Integer aponta para o mesmo objeto, ou seja, é preciso estar dentro da faixa do \-128 a 127 (limite de bits do Integer). Já o “.equals” tem o objetivo de verificar se os inteiros possuem o mesmo VALOR. Por isso, o X retorna true dos dois modos, mas o Y retorna true apenas do que verifica valor, já que ultrapassou o limite.*  
*b) Não é uma falha. É um comportamento previsto da linguagem para otimização. A evidência é que com 127, \== retorna true, mas com 128 retorna false, exatamente na mudança da faixa de cache explicada anteriormente.*  
*c)*   
*Prompt: “Explique o que é e como funciona o mecanismo de cache de Integer (também chamado de "Integer pool") dentro da linguagem Java de maneira resumida.”* 

*Resposta:*   
*O **Integer Cache** é um mecanismo do Java que reutiliza objetos Integer para economizar memória.*  
*Por padrão, o Java mantém em cache os valores de **\-128 até 127**. Assim:*  
*Integer a \= 100;*  
*Integer b \= 100;*  
*a e b apontam para o **mesmo objeto**, então a \== b resulta em true.*  
*Já fora dessa faixa:*  
*Integer a \= 200;*  
*Integer b \= 200;*  
*normalmente são criados objetos diferentes, então a \== b resulta em false.*  
*Por isso, para comparar valores de Integer, o correto é usar:*  
*a.equals(b)*  
***Resumo:** \== compara referências (objetos); .equals() compara os valores.*

*Sim a IA responde o intervalo de \-128 a 127 e é consistente com o comportamento anterior do passo 4\.*

### Atividade 2: Coerção de Tipos x Casting — Onde está a diferença?

*a) O 5 e o 7 são casting já que teve uma conversão escrita explicitamente no código. O restante é Coerção, pois não precisou desse conversor já que o Java faz automaticamente.*  
*b) O Java não arredonda. Como o valor foi convertido em Int, ou seja Integer, ele só aceita valores inteiros e descartou a parte decimal.*  
*c) Prompt: Qual é a diferença entre coerção e casting? Por que o Java exige que o programador escreva o casting explicitamente em conversões que podem causar perda de dados (narrowing), mas permite que o compilador faça a coerção sozinho em conversões que não perdem dados (widening)? De um exemplo de uma conversão que, mesmo sendo "widening"(de um tipo menor para um maior), ainda pode causar pequena perda de precisão em Java. Responda de maneira simples e curta.*

*Resposta:* 

***Coerção** é a conversão automática feita pelo Java, normalmente de um tipo menor para um maior (**widening**).*  
 ***Casting** é a conversão feita explicitamente pelo programador, usando `(tipo)`.*

*O Java exige casting em conversões **narrowing** porque elas podem perder dados. Assim, o programador confirma que está ciente do risco. Já no widening, geralmente não há perda significativa, então o Java faz automaticamente.*

*Exemplo de widening que pode perder precisão:*

*int numero \= 16\_777\_217;*  
*float valor \= numero;*

*O `int` vira `float` automaticamente, mas o `float` pode armazenar aproximadamente `16_777_216`, causando uma pequena perda de precisão.*

