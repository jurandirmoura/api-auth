# 🚀 REST API Java com Spring Boot

API RESTful desenvolvida em Java utilizando a ecologia do Spring Framework. O projeto implementa autenticação, controle de acesso e operações CRUD para gerenciamento eficiente de recursos, utilizando boas práticas de arquitetura e transferência de dados via DTOs.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+** - Linguagem base do projeto.
* **Spring Boot** - Framework para desenvolvimento acelerado da aplicação.
* **Spring Data JPA** - Abstração de acesso ao banco de dados e mapeamento objeto-relacional.
* **Spring Security** - Autenticação, autorização e proteção contra vulnerabilidades.
* **MySQL** - Banco de dados relacional para persistência de dados.
* **Lombok** - Redução de código boilerplate (getters, setters, construtores, etc.).
* **ModelMapper** - Mapeamento automatizado entre entidades de domínio e objetos DTO.

---

## 🏗️ Arquitetura

O projeto segue a estrutura em camadas clássica para APIs RESTful:

* **Controller**: Exposição dos endpoints REST e tratamento de requisições HTTP.
* **Service**: Regras de negócio e orquestração do fluxo de dados.
* **Repository**: Comunicação direta com o banco de dados MySQL via Spring Data JPA.
* **DTO (Data Transfer Object)**: Transferência controlada de dados entre cliente e servidor, mapeados via ModelMapper.
* **Security Config**: Definição de rotas públicas/protegidas e políticas de segurança.

---

## ⚙️ Configuração e Execução

### Pré-requisitos

* Java JDK 17 ou superior
* Maven instalado
* MySQL Server rodando localmente ou em container

### Passos para rodar a aplicação

1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio

```


2. **Configure o banco de dados MySQL:**
Crie um schema no MySQL (ex: `db_api`) e ajuste as credenciais no arquivo `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/db_api?useSSL=false&serverTimezone=UTC
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```


3. **Compile e execute a aplicação:**
```bash
mvn clean install
mvn spring-boot:run

```



A aplicação estará acessível em `http://localhost:8080`.

---

## 🔒 Segurança

A aplicação utiliza **Spring Security** para controle de acesso às rotas. Certifique-se de enviar as credenciais/tokens necessários nas requisições para endpoints protegidos.

