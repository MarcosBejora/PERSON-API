# PERSON-API
Funcionalidade para CRUD pessoa


README - PERSON-API

- Descrição do seu projeto
O Projeto Person-API foi desenvolvido para enriquecer meu Portfólio, com objetivo de demostrar conhecimentos adquiridos nos últimos meses.

Características e Objetivos da API:
- Qualidade de Código
- JDK 19/Springboot
- API REST
- Banco de Dados H2/JSON

Dependências:
- Spring Data JPA
- Spring Validation
- Spring Web
- H2 Database
- Lombok

Funcionalidades:
- Pessoa:
	POST
	GETONE
	GETALL
	PUT

- Endereço
	POST
	GETALL
	
- Entidades Relacionais para cadastro
	PESSOA/ENDEREÇO (OneToMany)

Utilização:
Arquivo Jar(executável): https://drive.google.com/file/d/1uluSivXZO5PQC3KqeM8zs_3X2KfavVci/view?usp=share_link
Acesso ao Projeto: https: http://github.com/MarcosBejora/PERSON-API
Acesso ao Banco em tempo de execução: http://localhost:8080/h2 
	Login:me
	Senha:(não possui)

Utilização no Postman:
	PERSON POST: http://localhost:8080/person-api/person
	PERSON GETALL: http://localhost:8080/person-api/person/
	PERSON GETONE: http://localhost:8080/person-api/person/{id}
	PERSON PUT: http://localhost:8080/person-api/person/{id}
	ADDRESS POST: http://localhost:8080/person-api/address
	ADDRESS GETALL: http://localhost:8080/person-api/address/

01_2023_Marcos Bejóra
