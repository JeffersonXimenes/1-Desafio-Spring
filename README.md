# Primeiro Desafio Java Spring

O propósito desse teste e avaliar a arquitetura do projeto do qual você ira montar.. o que você vai priorizar e como será feito. Para esse desafio, você deverá realizar a modelagem abaixo, sinta-se a vontade para fazer em qual banco você quiser.
Lembre-se, caso você tenha uma solução melhor sinta-se a vontade para implementar. Só não mude completamente o modelo relacional.

Ao final do projeto, o código deve ser disponibilizado no git hub. Vale ressaltar que é muito importante seu commit está bem separado de acordo com cada funcionalidade, pois isso facilita na hora da correção. Os script construídos da tabela deverá estar junto com o projeto.

Vale ressaltar, que você deve se preocupar com as boas práticas, retornar uma DTO ter o seu código bem acoplado, cada classe com sua responsabilidade... explore bastante boas práticas no java. Abaixo estarei listando alguns tópicos interessante:

- 🤔 [O que é uma DTO?](https://pt.stackoverflow.com/questions/31362/o-que-%C3%A9-um-dto)
- 🤔 [Autenticação JWT](https://www.treinaweb.com.br/blog/implementando-autenticacao-baseada-em-jwt-em-uma-api-restful-jax-rs)
- 🤔 [Implementando Swagger](https://www.treinaweb.com.br/blog/documentando-uma-api-spring-boot-com-o-swagger) 
- 🤔 [SQL Server - Tipos de Dados Java](https://docs.microsoft.com/pt-br/sql/connect/jdbc/using-basic-data-types?view=sql-server-ver15)
- 🤔 [SQL Server - Aprendendo a criar tabelas](https://www.w3schools.com/sql/sql_create_table.asp)

## 1️⃣ Primeira parte

Na primeira parte desse desafio, o objetivo vai ser de criar a estrutura do projeto, e fazer os CRUD (Create, Post, Update e Delete) do Controller.

### Versionando seu código

#### Tarefa 🔀

- O versionamento do nosso código é algo muito importante, para cada tarefa que está sendo solicitada for concluída, faça um commit para o seu repositório.

[Referência a respeito do GIT](https://rogerdudler.github.io/git-guide/index.pt_BR.html)
* * *

### Uso de anotações de validações

Quando usamos DTOs, queremos aproveitar para validar que os dados enviados para nossa API sejam válidos. Para isso, podemos usar anotações que podem avaliar o formato nos quais os campos foram preenchidos.

Seguem algumas referências a respeito:

- [Validador Spring](https://www.zup.com.br/blog/spring-validation-o-que-e?utm_source=google-chat&utm_medium=interno&utm_campaign=gc-geral)
- [Validador dados com anotações](https://www.devmedia.com.br/bean-validation-1-1-validando-dados-com-anotacoes/30070)
- [Bean validation](https://emmanuelneri.com.br/2017/05/30/criando-validacoes-de-bean-validation-customizadas/)
- [Validador Hibernate](https://www.devmedia.com.br/hibernate-validator-validando-dados-no-back-end-com-anotacoes/37979)
- [Validar CPF](https://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097)

#### Tarefa ♻️

- Atualize as anotações necessárias para validar o formato dos campos de `CPF`, `EMAIL` e `NOME` do DTO de requisição (UserForm).

* * *

## 2️⃣ Terceira parte

### Tratamento de Exceções

Queremos que nossa API sejam fácil de uso e clara no seu funcionamento para quem for consumir ela. Para isso, é importante garantir que os erros esperados e/ou inesperados sejam tratados de forma amigáveis. Uma boa prática é usar Exception Handlers para isso.

Seguem algumas referências:

- [Exception Handlers](https://qastack.com.br/programming/28902374/spring-boot-rest-service-exception-handling)
- [Exception Java](https://www.devmedia.com.br/trabalhando-com-excecoes-em-java/27601)
- [Tratar Exceções Java](https://www.devmedia.com.br/como-tratar-excecoes-na-linguagem-java/39163)

#### Tarefa 🔎

- Crie uma classe de `Exception Handler` para retornar `mensagens` e `http status` amigáveis caso erros esperados ou inesperados ocorram no uso da sua API.

* * *
##  3️⃣ Terceira parte
#### Requisitos

- Criar projeto webservice rest com spring boot;
- Disponibilizar swagger da aplicação;
- Criar crud de funcionário e cargo;
- Consulta de funcionários de um departamento;
- Manter histórico dos departamentos que o usuário trabalhou;
- Definir Chefe do departamento;
- Implementar documentação Swagger;
- Implementar autenticação com Token;
- Buscar um funcionário pelo CPF e o nome;
- Tratamento de exceções.

##  4️⃣ Quarta parte
### Criação das tabelas 
Abaixo foi montado as tabelas necessárias para o seu desenvolvimento. Deve ser seguido os mesmos tipos, chaves e nomes de coluna que estão descritos na tabela. 

<strong>TB_CARGO</strong>

| COLUNA | TIPO  | CHAVE |
| :------------ |:---------------:| -----:|
| id      | INT | PK |
| cargo      | VARCHAR (30)        |   NOT NULL |

<strong>TB_FUNCIONARIO</strong>

| COLUNA | TIPO  | CHAVE |
| :------------ |:---------------:| -----:|
| id      | INT | PK |
| nome      | VARCHAR (40)        |   NOT NULL |
| idade      | INT        |   NOT NULL |
| data_nascimento      | DATE        |   NOT NULL |
| documento      | VARCHAR (50)        |   NOT NULL |
| cpf      | VARCHAR (50)        |   NOT NULL |
| cargo_id      | INT        |   FK |

<strong>TB_FUNCIONARIO_DEPARTAMENTO</strong>

| COLUNA | TIPO  | CHAVE |
| :------------ |:---------------:| -----:|
| id_departamento      | INT |  FK  |
| id_funcionario      | INT        |   FK  |

<strong>TB_DEPARTAMENTO</strong>

| COLUNA | TIPO  | CHAVE |
| :------------ |:---------------:| -----:|
| id      | INT |  FK  |
| nome      | VARCHAR (50)        |   NOT NULL  |

### Modelo relacional
![alt text](https://raw.githubusercontent.com/JeffersonXimenes/1-Desafio-Spring/main/modelagemBD.png)

***

