# Herança

## Roteiro de Atividades

- Nome: Fabio Grosso Lira  
- Data: 20/10

### Atividade 1: Sistema de funcionários da empresa
    1. _Se Gerente não chamar super(...), o compilador tenta inserir super() automaticamente. Como Funcionario possui apenas um construtor com parâmetros, não existe um construtor vazio para ser chamado. Ocorre um erro de compilação, pois Java exige que a parte herdada do objeto seja inicializada por um construtor válido da superclasse._
    2. _O método toString() vem da classe Object, da qual todas as classes Java herdam, direta ou indiretamente. Por padrão, ele retorna o nome da classe e uma representação hexadecimal do hash do objeto. A anotação @Override é recomendada porque faz o compilador verificar se estou realmente sobrescrevendo um método existente, detectando erros de grafia ou de assinatura._
    3. 
    _Prompt: Explique quando a herança é uma má escolha de projeto em Java e quando a composição é preferível, usando um exemplo em que um funcionário possa desempenhar vários papéis ao mesmo tempo. Mostre um código Java simples.
    Resposta da IA:
    A herança não é ideal quando a relação entre classes não representa um verdadeiro "é um", ou quando um objeto precisa exercer mais de um papel que pode mudar ao longo do tempo. Em Java, uma classe só pode estender uma superclasse diretamente. Se um funcionário puder atuar simultaneamente como gerente e desenvolvedor, representá-lo com uma única subclasse fixa será limitador. A composição permite que o funcionário tenha uma coleção de objetos Papel e receba ou perca responsabilidades sem mudar sua classe.
        Exemplo Java (também disponível em composicao/TesteComposicao.java):
        import java.util.ArrayList;
        import java.util.List;

        interface Papel {
            String descricao();
        }

        class PapelGerente implements Papel {
            @Override
            public String descricao() { return "Gerente"; }
        }

        class PapelDesenvolvedor implements Papel {
            @Override
            public String descricao() { return "Desenvolvedor"; }
        }

        class FuncionarioComPapeis {
            private final String nome;
            private final List<Papel> papeis = new ArrayList<>();

            public FuncionarioComPapeis(String nome) { this.nome = nome; }

            public void adicionarPapel(Papel papel) {
                papeis.add(papel);
            }

            public void apresentar() {
                System.out.println("Papeis de " + nome + ":");
                for (Papel papel : papeis) {
                    System.out.println("- " + papel.descricao());
                }
            }
        }

        public class TesteComposicao {
            public static void main(String[] args) {
                FuncionarioComPapeis ana = new FuncionarioComPapeis("Ana");
                ana.adicionarPapel(new PapelGerente());
                ana.adicionarPapel(new PapelDesenvolvedor());
                ana.apresentar();
            }
        }
        
    Minha Resposta: Eu usaria herança quando uma classe realmente for um tipo específico de outra, como Gerente ser um tipo de Funcionario. Mas, se uma pessoa puder ter várias funções ao mesmo tempo, prefiro composição. Assim, não preciso criar uma classe para cada combinação de cargos: basta adicionar os papéis necessários ao mesmo funcionário._
