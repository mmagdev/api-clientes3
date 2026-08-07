# API Clientes

Este projeto é uma API construída com Spring Boot para gerenciamento de clientes e planos.

Resumo

- Objetivo: fornecer endpoints REST para cadastro, consulta, atualização e remoção de clientes e planos.
- Tecnologias principais: Spring Boot, Spring Web, JDBC (conexão direta com banco, sem Spring Data JPA), Lombok, Swagger (OpenAPI), Docker, Docker Compose, PostgreSQL e pgAdmin.

Estrutura do projeto

O código está organizado em camadas para separar responsabilidades. A seguir há uma explicação da função de cada camada (não são descritas as classes específicas dentro de cada pacote):

- configurations
  - Contém classes de configuração da aplicação, por exemplo configurações do Swagger/OpenAPI, datasource (conexão com o banco) e outras configurações transversais.

- controllers
  - Expõe os endpoints REST da API. Traduz requisições HTTP em chamadas aos serviços apropriados e retorna respostas HTTP.

- entities
  - Define as entidades/dominios que representam os dados persistidos no banco (por exemplo: Cliente, Plano). Essas classes modelam a forma das tabelas e dos objetos do domínio.

- services
  - Implementa a lógica de negócio da aplicação. Recebe dados dos controllers, aplica regras de negócio e delega operações de persistência para os repositórios.

- dtos
  - Contém objetos de transferência de dados (Data Transfer Objects) usados para modelar as requisições e respostas da API, separando formato de transporte da representação interna das entidades.

- repositories
  - Camada responsável pela interação com o banco de dados. Neste projeto utiliza-se JDBC (sem Spring Data JPA), ou seja, a comunicação com o banco é feita por meio de templates/queries JDBC diretas.

Banco de dados

O banco de dados é executado via Docker através do arquivo `docker-compose.yml`. O serviço é um PostgreSQL e inclui também o pgAdmin para gerenciamento visual do banco.

Links úteis

- Spring Boot: https://spring.io/projects/spring-boot
- Spring Web (starter web / REST): https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-developing-web-applications
- JDBC (Java Database Connectivity): https://docs.oracle.com/javase/8/docs/technotes/guides/jdbc/
- Lombok: https://projectlombok.org
- Swagger / OpenAPI: https://swagger.io
- Docker: https://www.docker.com
- Docker Compose: https://docs.docker.com/compose/
- PostgreSQL: https://www.postgresql.org
- pgAdmin: https://www.pgadmin.org

Observações

- A documentação foca em explicar o propósito do projeto, suas camadas e as tecnologias utilizadas.
- Não inclui instruções de execução ou setup do ambiente (conforme solicitado).
