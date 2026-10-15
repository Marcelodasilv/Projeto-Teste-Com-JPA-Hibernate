# Projeto-Teste-Com-JPA-Hibernate

Projeto de estudo que une JPA com Hibernate, Maven e um banco MySQL local. A aplicação roda no console e faz o CRUD (inserir, ler, atualizar e deletar) de clientes.

## Tecnologias

- Java 21
- Maven
- Hibernate 5.6.15.Final (JPA)
- MySQL e mysql-connector-j 8.0.33

## Funcionalidades

- Cadastrar cliente (nome, idade e dinheiro)
- Consultar cliente por ID
- Atualizar os dados de um cliente
- Deletar cliente por ID

## Requisitos

- JDK 21 ou superior
- Maven
- MySQL em execução na máquina local (porta 3306)

## Configuração

1. Crie o banco de dados no MySQL:

   ```sql
   CREATE DATABASE ServidorMySQL;
   ```

2. Abra o arquivo `src/main/resources/META-INF/persistence.xml` e informe o usuário e a senha do seu MySQL nas propriedades `javax.persistence.jdbc.user` e `javax.persistence.jdbc.password`.

3. A tabela `usuarios` é criada automaticamente pelo Hibernate na primeira execução (`hibernate.hbm2ddl.auto` configurado como `update`).

Importante: não envie a senha real do seu banco para o repositório.

## Como executar

Compile o projeto com o Maven:

```
mvn compile
```

Depois execute a classe `PrimeiroProjeto.Main` pela sua IDE (Eclipse, IntelliJ etc.).

## Estrutura

- `Main`: inicia a conexão e chama o menu
- `Menu`: exibe as opções e direciona para cada operação
- `Insert`, `Read`, `Update`, `Delete`: operações do CRUD
- `CRUD`: interface implementada pelas operações
- `Clientes`: entidade mapeada para a tabela `usuarios`

## Autor

Marcelo da Silva Barbosa - [Marcelodasilv](https://github.com/Marcelodasilv)
