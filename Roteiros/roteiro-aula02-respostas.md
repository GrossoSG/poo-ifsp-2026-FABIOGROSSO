# JVM, Versionamento

## Roteiro de Atividades

- Nome: Fabio Grosso Lira  
- Data: 11/08

### Atividade 2: JVM e o princípio Write once, run anywhere

a. _O arquivo .class contém bytecode Java, e não código de máquina. A JVM interpreta ou compila esse bytecode em instruções que o processador consegue executar._
b. _Isso é possível porque o bytecode é independente do sistema operacional e cada sistema possui sua própria JVM. Em uma linguagem compilada diretamente para código nativo, como C, normalmente seria necessário recompilar o programa para cada sistema e arquitetura._
c.
    _Prompt: 
    Explique de maneira simples a diferença entre bytecode, JVM, JRE e JDK e como eles se relacionam com o princípio "write once, run anywhere" do Java.
    
    Resposta:
    * **Bytecode:** código intermediário gerado pelo compilador Java (`.class`).
    * **JVM:** executa o bytecode no sistema operacional.
    * **JRE:** contém a JVM + recursos necessários para **rodar** programas Java.
    * **JDK:** contém a JRE + ferramentas para **desenvolver e compilar** Java.

    **Relação:**
    `Código Java → JDK compila → Bytecode → JVM executa`

    Isso permite o **“write once, run anywhere”**: o mesmo bytecode pode rodar em qualquer sistema que tenha uma JVM compatível.

    
    Minha Resposta: O Java é compilado para bytecode. A JVM executa esse bytecode no sistema. A JRE fornece o ambiente necessário para execução e o JDK fornece as ferramentas para desenvolver e compilar. Por isso, o mesmo programa pode funcionar em diferentes sistemas sem precisar ser recompilado._

### Atividade 3: Criação de repositório no GitHub

a. _git add prepara as alterações para o próximo commit. git commit registra essas alterações no repositório local. Se eu fizer apenas git add, as alterações continuam salvas localmente e não são enviadas ao GitHub._
b. _O git commit salva as alterações somente no repositório local. O git push envia os commits para o repositório remoto no GitHub._
c. 
    _Prompt: 
    A mensagem de commit "aula 02: criar o repositorio e adicionar README.md" segue boas práticas de commits semânticos? Sugira uma versão melhor.
    
    Resposta: Não exatamente. Em **Conventional Commits**, é melhor começar com um tipo como `feat`, `fix`, `docs`, `chore`, etc.

    Uma versão melhor seria:

    `chore(aula-02): criar repositório e adicionar README.md`

    Se o foco do commit foi principalmente o README:

    `docs(aula-02): adicionar README.md`_

