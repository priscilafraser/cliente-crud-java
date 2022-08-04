# cliente-crud-java

### Para criação da tabela no banco de dados, utilizada no código:

```
create table cliente (
	id serial primary key,
	nome varchar(100),
	telefone varchar(30),
	email varchar(80) NOT NULL,
	cep varchar(20) NOT NULL,
	logradouro varchar(100) NOT NULL,
	numero varchar(30) NOT NULL,
	complemento varchar(200),
	bairro varchar(30) NOT NULL,
	estado varchar(30) NOT NULL,
	perfil varchar(255) NOT NULL,
	senha varchar(255) NOT NULL,
	datacadastro date not null default CURRENT_DATE
)
```

### Para testes de cada método crud

No arquivo principal JDBCliente.java estão todos os métodos CRUD comentados. Para utilizá-los basta tirar o método escolhido dos comentários e rodar o arquivo.
