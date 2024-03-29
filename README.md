﻿# credit-application.system

# Kotlin no BackEnd com Spring Boot 3

- nesse inicio iremos instalar uma abiente de desenvolvimento chamado Intellij

- Nesse Ambiente de desenvolvimento ele suporta linguagens do tipo java e kotlin.

Geral: para o desenvolviemnto de uma aplicação web, é impornate utilizar ferramnetas modernas e confiaveis para garantir a qualidade, desempenho e segurança de um software. Nesse curso, vamos conehcer algumas ferramentas pertinentes para o desenvolvimentode um produto computacional de qualidaade, uma REST Api Spirng boot e Kotlin

Pré-requisitos:

- IDE para desenvolviemnto Ktlin (Intellij Community)
- JDK 17+
- Kotlin 1.7.22
- Sintaxe basica Kotlin Conhecimento acerca de POO

Percuso: 

- Entendo a arquitetura rest
- Overview do Spring framework
- Arquitetura de tres camadas do spirng boot


#### O que é Api

- API significa Application Programming Interface
- Nesse contexto, a plicação refere-se a qualquer softwarre como uma função distinta
- A interface pode ser pensada como um contrato de serviço entre duas aplicações
- A documentação de suas respotas APIs contém informações sobre como os desenvoldores dee estruturar essas solititações e respotas

##### Como as APis funcionam

- A arquitetura da API geralmente é explicada em termos de cliente e servidor
- A aplicação que envia a solitação é chamada de cliente e a aplicação que envia a resposta é chamada de servidor

Outras arquiteturas que enviam as respostas das APIs:

- APIs SOAP: Cliente e servidor trocam mensagens usando XML. Esta é uma APi menos flexível que era mais popular
-  APIs RPC: O cliente conclui uma funçõa (ou uma pronucionamento) no servidor e o servidor envia  a saída que er amsi popular
- APIs WebSocket: O servidor pod enviar mensagens de retorno de chamada a clientes conectados, tonando-o mais eficinete que a API Rest
- APIs REST: REST significa transferencia representacional de estado, clientes e servidores trocam dados usando HTTP, O HTTP permite criarm atualizar, pesquisar, executar e remover operações, atuando sob determiandos recursos, A principal carcteristca dessa API é a ausencia de estado

#####  ° Meteodos HTTP

- GET: Recuperar um dado
- HEAD: inspecionar dados no bd
- PUT: depositar um dado no bd
- POST: postra algo no bd
- PATCH: dar uppdate em um dado
- TRACE:volta uma messagem recedida
- OPTIONS: capacidades do servidor
- DELETE: deletar um dado

###### O que é spring framework

- O spirng é um framewwork java cirado com o obejtivo de facilitar o desenvolvimento de aplicações
- Baseado na IoC e DI, fornecendo para isso um container, que representa o nucledo do framwork e que é repsonsavel por cirar e genreciar os componentes da aplicação, os quais são comumente chamados de beans
- Spirng Boot é um framework open source ele traz mais agilidade para o porcesso de desenvolvimento, uma vez que os devs conseguem reduzir o tempo gasto coma as configurações iniciais

### Criando uma API Rest Spirng Boot e Kotlin com Persistencia de dados

- Objtivo geral: Conheça o Spring Boot, projeto que facilita  implemnetação de repositorios baseados em banco de dados relacionais. Nesse contexto, explore a linguagem de porgramação Kotlin e entenda como o projeto Spirng Data JPA facilita a criaçõa de aplicativos em Spring que usam tecnologias de acesso a dados

Pré requisitos: 
    
    * IDE para desenvolviemnto
    * JDK 17+
    * Postman
    * Sintaxe Kotlin e POO
    * Entendimento sobre arquitetura REST
    * Utilização do Spring Boot 3.0.3
    * Noções sobre BDR

JBC: significa java Database Connectivit, é uma API de nível de chamdam  o que signifca qque as instruções SQL sõa transmitidas como sequencias para a APi que, então, se encarrega de executa-las nos RDMS

JPA: O JPA(Java Persisntence API) define uma maneira para mapear plain old java obejcts(POJO), para um banco de dados. Estes POJOs são chamados de entidades, portanto é um franwrokd utilizado na camda de Persistencia para o desenvolvedor ter uma maior produtividade no contexto Java

Spring Data JPA: é a maior parte da familia Spirng Data, facilita a implemnetação de repositorios baseados em JPA, esse modulo lida com suporte apirmorado para camadas acesso a dados baseadas em JPA

O que faremos?: API para sitema de avaliação de credito



Uma empresa de empréstimo precisa criar um sistema de análise de solicitação de crédito. Sua tarefa será criar uma API REST SPRING BOOT E KOTLIN 🍃💜 para a empresa fornecer aos seus clientes as seguintes funcionalidades:

Cliente (Customer):

 Cadastrar:
- Request: firstName
- lastName
- cpf
- income
- email
- password 
- zipCode 
- street
Response: String

Editar cadastro:

Request:

- id
- firstName
- lastName
- income
- zipCode
- street
* Response: firstName, lastName, income, cpf, email, income, zipCode, street

Visualizar perfil:

Request: 
- id
* Response: firstName, lastName, income, cpf, email, income, zipCode, street

Deletar cadastro:

Request: 

- id

* Response: sem retorno

Solicitação de Empréstimo (Credit):
Cadastrar:
Request: creditValue, dayFirstOfInstallment, numberOfInstallments e customerId
Response: String

Listar todas as solicitações de emprestimo de um cliente:
Request:
- customerId
Response: creditCode, creditValue, numberOfInstallment

Visualizar um emprestimo:

Request: 

- customerId e creditCode

* Response: creditCode, creditValue, numberOfInstallment, status, emailCustomer e incomeCustomer

##### fazendo um git do nosso projeto

- siga as linhas de codigos no terminal:

```
echo "# "nome do repositorio" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/diegomaia04/"nome do repositorio.git
git remote set-url origin https://github.com/diegomaia04/"nome do repositorio"
git push -u origin main

```

#### Criando as classes de Persistencia

* vamos criar uma nova branch bia git para a criação das classes, utilizando o comando: 

- PROJETO FINALIZADO.

### Instrução de Uso

No Terminal/Console:

	<li>Faça um clone do projeto na sua máquina: <code>git clone git@github.com:cami-la/credit-application-system.git</code></li>
	<li>Entre na pasta raiz do projeto: <code>cd </code></li> 
	<li>Execute o comando: <code>./gradlew bootrun</code></li>
    

-  Visando facilitar a demostração da aplicação, recomendo instalar apenas o IntelliJ IDEA e executar o projeto através da IDE 
