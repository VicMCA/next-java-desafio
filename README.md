
# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.5/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Funcionalidades da API

- **`Listar os pratos de comida da sua API`**: Sua API deve ser capaz de retornar uma listagem, de uma parte de todos os pratos de comida que estão cadastrados na sua API.

- **`Cadastrar um prato de comida na sua API`**: Sua API deve ser capaz de cadastrar um novo produto na sua API.

- **`Listar as categorias da sua API`**: Sua API deve ser capaz de retornar uma listagem, de todas as categorias que estão cadastrados na sua API.

- **`Buscar pratos de comida ou categorias por id ou com filtros personalizados`**: Em sua API deverá ser capaz de fazer uma busca na API de acordo com o parametro enviado na sua requisição.

- **`Listar os pedidos da sua API`**: Sua API deve ser capaz de retornar uma listagem, com as informações dos produtos pedidos, de todos os pedidos que estão cadastrados na sua API.

**Dica**: Por se tratar de um desafio simples sem autenticação e de não possuir usuários, não será necessário cadastrar o campo `user_id`, considere que deve ser listados todos os pedidos da API como se fossem os seus pedidos.

- **`Listar os pratos favoritos da sua API`**: Sua API deve ser capaz de retornar uma listagem, com os campos e as informações dos produtos favoritados, de todos os favoritos que estão cadastrados na sua API.

**Dica**: Por se tratar de desafio simples sem autenticação e de não possuir usuários, não será necessário cadastrar o campo `user_id`, considere que deve ser listados todos os favoritos da API como se fossem os seus favoritos.

### Exemplo de rotas da API

  - **Rota `/produtos`**: Retorna todos os produtos cadastrados na API

  - **Rota `/produto/:id`**: Retorna um produto cadastrado na API baseado no `id`

  - **Rota `/categorias`**: Retorna todas as categorias cadastradas na API

  - **Rota `/pedidos`**: Retorna todas os pedidos que foram cadastrados na API

  - **Rota `/favoritos`**: Retorna todas as comidas favoritas que foram cadastrados na API





