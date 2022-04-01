# **Café da manhã MV** 
<div>
    <p align="center">
        <a href="#">
            <img src="https://img.shields.io/static/v1?label=Language&message=Java&color=blue&style=for-the-badge&logo=Java" alt="Idioma: Javascript">
        </a>
        <br>
        <a href="#">
        <img src="https://img.shields.io/static/v1?label=Servidor&message=MySQL&color=ciano&style=for-the-badge&logo=MySQL" alt="Language: Typescript">
    </a>
    </p>
    
### Objetivo:

O projeto tem como função organizar o Café da manhã de uma empresa. montando uma aplicação web (front a sua escolha) com backend em JAVA (REST). 

Evitando assim, possíveis conflitos em relação ao alimento levado e a indentificação do indivíduo. Tornando o evento mais organizado.

### Regras:
- Não poderá repetir cpf.
- Não poderá repetir opção de café da manhã mesmo que seja outro colaborador.
- Implemente utilizando a linguagem Java com a IDE eclipse.
- Utilizar NativeQuery para inserção, atualização, consulta e exclusão (SQL).

### Features deste projeto: 
Consiste numa aplicação que permite a inserção de possíveis pratos que os funcionários de uma empresa podem trazer para o café da manhã.

É possível cadastrar um prato vinculado a um nome e um CPF, podendo também deletar esse dado e trazer a listagem de todos os pratos.

Também no projeto foi implementada a regra de negócio onde não é possível inserir no banco um mesmo prato, ou uma prato vinculado a um registro previamente inserido no banco.

Obs.: para testar essa feature, tente inserir um prato que já exista no bd, ou com um cpf já registrado.

### Como rodar em sua máquina:
1. baixe o MySQL
2. configure o MySQL acordo com o `ConnectionFactory.java`, se preferir mudar porta e senha, mude este arquivo
3. Se preferir visualizar o banco de dados pelo DBeaver, siga a dica deste link:     https://cursos.alura.com.br/forum/topico-erro-public-key-retrieval-is-not-allowed-ao-fazer-test-connection-no-dbeaver-como-resolver-137427
4. A partir do `Main.java` você poderá testar os 4 métodos CRUD apenas descomentando o que for usar e rodando o projeto.



##### **OBS:**  _Projeto em desenvolvimento! CRUD realizado em JAVA usando a IDE eclipse. Utilizando o mySQL e o auxílio do Dbeaver para ajudar na manipulação do banco de dados. Os outros parâmetros do projeto estão se desenvolvendo._


