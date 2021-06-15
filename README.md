#  Sobre

Esse "pequeno" projeto, consistem em uma amostra de API REST CRUD com Spring Boot, Mysql, e JPA .

## Tecnologias
 -  Java
 - SpringBoot
 - JPA
 - My SQL
 - Maven

## Passos para Executar o Projeto


 - Clone esse projeto para sua máquina e abra em sua IDE favorita.
 - Crie um banco de dados com o nome "pessoas".
  
  OBSERVAÇÕES: 
 - A porta utilizada no banco de dados é a 3306. Caso necessite usar outra porta, siga o passo-a-passo a seguir: Com o projeto aberto na IDE --> src/main/resources -->  application.properties, modifique a porta no caminho jdbc:mysql://localhost:3306/pessoas.

Feitos todos os passos anteriores, o sistema pronto para ser executado;

 - Execute a API REST, e faça os testes por meio do POSTMAN
  ## Comandos
 
 /api/clientes/insert        *(inseri um cliente)*
 /api/clientes/list *(lista todos os clientes existentes)*
 /api/clientes/search/{informe aqui o id do cliente} *(busca um cliente especifico)*
 /api/clientes/delete/{informe aqui o id do cliente} *(exclui um cliente)*
 /api/clientes/update/{informe aqui o id do cliente} *(atualiza um cliente)*
 
 


## DEMONSTRAÇÃO 

A demonstração desse projeto pode ser vista em vídeo no YouTube por meio desse link; https://www.youtube.com/watch?v=uMV8UyKXeuc
