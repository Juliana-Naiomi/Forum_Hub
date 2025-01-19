"# ForumHub" 

**Desafio Forum Hub** 

Objetivo O Forum Hub é um projeto que busca criar um fórum de discussão no estilo do fórum da Alura, onde alunos, professores e moderadores podem interagir, tirar dúvidas e compartilhar conhecimentos. Usando o Spring Framework, o foco está em desenvolver uma API REST eficiente, segura e capaz de promover a aprendizagem colaborativa. 

***Funcionalidades*** 

1. Rotas REST bem definidas: As rotas da API seguirão os padrões REST, garantindo que sejam fáceis de entender, manter e escalar. 

2. Validações robustas: Os dados enviados para a API passarão por validações baseadas nas regras do sistema, garantindo que apenas informações consistentes sejam armazenadas. 

3. Banco de dados relacional: Os dados do fórum serão salvos de forma organizada e eficiente em um banco de dados relacional, garantindo segurança e desempenho. 

4. Segurança com autenticação e autorização: Apenas usuários autenticados e autorizados poderão acessar ou alterar dados. Será utilizado JWT (JSON Web Token) para proteger as operações. 

***Tecnologias Utilizadas***
pring Framework: Base do desenvolvimento da API REST. Banco de Dados Relacional: Para armazenar e recuperar os dados do sistema. JWT: Para gerenciar a autenticação e autorização dos usuários. 

***Estrutura do Projeto***
O projeto será organizado de forma modular, respeitando boas práticas de desenvolvimento. 

Controladores: Recebem as requisições HTTP e direcionam as operações para os serviços. 
Serviços: Contêm a lógica do sistema e fazem a comunicação com os repositórios. 
Repositórios: Responsáveis pela manipulação dos dados no banco de dados. 
Modelos: Representam as entidades do sistema, como "Usuário" e "Curso". 
