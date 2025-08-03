<h1 align="center">
  Cadastro Usuário
</h1>

API para gerenciar usuários (CRUD).

## Tecnologias
 
- Spring Boot
- Spring MVC
- Spring Data JPA
- Database H2

## Práticas adotadas

- SOLID
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/cadastro-usuarios-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8081](http://localhost:8081).

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Postman:

- Criar Usuário 
```
$ http POST localhost:8081/usuario nome="Janine" email="janine@email.com"

[
  {
    "nome": "Janine",    
    "email": "janine@email.com"   
  }
]
```

- Listar Usuários
```
$ http GET localhost:8081/usuario?email=janine@email.com

[
{
    "id": 1,
    "email": "janine@email.com",
    "nome": "Janine"
}
]
```

- Atualizar Usuário
```
$ http PUT localhost:8081/usuario?id=1 nome="Janine Chaves" 

[
  {
    nome="Janine Chaves"
  }
]
```

- Remover Usuário
```
http DELETE localhost:8081/usuario?email=janine@email2.com

[ ]
```
