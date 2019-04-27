# JSF

Este projeto está estruturado com os assuntos relacionados ao JSF.

**Aulas**

*[Aula 1 - Conceitos Básicos ](https://github.com/ifpb-disciplinas-2019-1/dac-jsf/commit/691120c79626852cafb07edaad7851278c493c20)*

*[Aula 2 - HTML 5, Conversores e Validadores ](https://github.com/ifpb-disciplinas-2019-1/dac-jsf/commit/491438e20057acda0cd627b4bceb373036a9f66e)*


# Atividade prática

Desenvolva uma aplicação que realize as operações de CRUD para a entidade `Pessoa` e `Dependente`. 
As funcionalidades precisam estar disponíveis com UI (interface para o usuário) com um template usável.

```java
public class Pessoa {
    private int id;
    private String nome;
    private CPF cpf;
    private Dependente dependente;
}
class Dependente{
    private String uuid;
    private String nome;
    private LocalDate dataDeNascimento;
}
```
## Metodologia

Esta atividade prática está planejada em um conjunto de requisitos e para ser desenvolvida individualmente. 
Cada aluno deve fazer o __fork__ deste projeto e implementar sua própria solução. 

Caso surja alguma dúvida no desenvolvimento, falar de imediato via [Slack](https://ifpb-dac-20191.slack.com/messages/CHZGZMM17/). 
> Lembrete: Não guardem dúvidas, elas são como as dívidas. Acumulam-se e nos prejudicam :)
 

## Requisitos

* **RF01** - Implementar os métodos acessores para as classes `Pessoa` e `Dependente`; *
* **RF02** - Implementar a classe `PessoasEmMemoria`; *
* **RF03** - Adaptar a página `edit.xhtml` para o arquivo de template `templateAula.xhtml`; *
* **RF04** - Criar um Conversor para a classe `Dependente`; *
* **RF05** - Adicionar um `selectOneMenu` na página `edit.xhtml` da pasta __pessoa__. 
Deve ser possível selecionar um `Dependente` e associar sua instância ao atributo da classe `Pessoa` *
```
<h:selectOneMenu value="{controladorDePessoas.pessoa.dependente}" 
                 converter="converter.Dependente">
    <f:selectItems value="{controladorDePessoas.listarTodosOsDependentes()}"
                   var="dep" itemLabel="{de.uuid}" />
</h:selectOneMenu>
```
* **RF06** - Criar as páginas para edição e listagem da entidade `Dependente`; *
* **RF07** - Criar um Validador para a classe `Dependente`. Serão válidos apenas Dependentes que possuem data de nascimento anterior a data atual e o nome não vazio; *
* **RF08** - Atualizar o template para algum outro layout. O ideial seria utilizar alguma biblioteca de componentes como o Materialize, Bootstrap, etc. 
Contudo, caso prefiram, podem desenvolver sua própria solução; *
* **RF09** - Criar uma página que permita realizar uma busca por `CPF`; *
* **RF10** - Criar e Implementar a classe `PessoasEmJDBC` que é uma solução que utiliza a conexão com Banco de Dados. *