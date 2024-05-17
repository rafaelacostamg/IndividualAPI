<!DOCTYPE html>
<html

<body>
  <h1 align="center">Biblioteca - API</h1>
</br>
   <div align="center">
    <img src="https://github.com/rafaelacostamg/IndividualAPI/blob/main/Biblioteca%20-%20API.png">
  </div>
</br>
 
  ## :desktop_computer:Sobre o Projeto:
  
   <p> Bem-vindo(a) ao repositório do projeto individual de conclusão da disciplina "Desenvolvimento de API restful" na Residência de Software 2024.1 do SERRATEC. Este projeto consiste na criação de uma API para uma biblioteca utilizando os conceitos e técnicas aprendidas durante o curso. </p>
  
  ## :hammer_and_wrench: Tecnologias utilizadas:
 <div>
 </br>
 <img src="https://github.com/rafaelacostamg/IndividualAPI/blob/main/imagensREADME/Spring%20Tools%20Suite%204.png" height="40" width="40"> 
 </br>
 <a href="https://spring.io/tools">SpringTool</a> 
 </div>
 <div>
 </br>
 <img src="https://github.com/rafaelacostamg/IndividualAPI/blob/main/imagensREADME/Java%2017.png" height="40" width="40"> 
 </br>
 <a href="https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html">Java17</a> 
 </div><div>
 </br>
 <img src="https://github.com/rafaelacostamg/IndividualAPI/blob/main/imagensREADME/Maven.png" height="40" width="40"> 
 </br>
 <a href="https://maven.apache.org">Maven</a> 
 </div><div>
 </br>
 <img src="https://github.com/rafaelacostamg/IndividualAPI/blob/main/imagensREADME/Spring%20Boot.png" height="40" width="40"> 
 </br>
 <a href="https://start.spring.io">SpringBoot</a> 
 </div>

 </br>
  <h3>Endpoints</h3>

<li>Obter todos os livros</li>
</p>
- GET '/livros'</p>
- Descrição: Retorna uma lista de todos os livros disponíveis na biblioteca.</p>

<li>Obter livro por ID</li>
</p>
- GET '/livros/{id}'</p>
- Descrição: Retorna os detalhes de um livro específico, buscando pelo ID.</p>
- Parâmetros: id (ID do livro que você deseja obter).</p>

<li>Adicionar um novo livro</li>
</p>
- POST /livros</p>
- Descrição: Adiciona um novo livro ao catálogo.</p>
- Corpo da Requisição:</p>
  json</p>
  {</p>
    "titulo": "Título do Livro",</p>
    "autor": "Autor do Livro",</p>
    "dataPublicacao": "Data de Publicação",</p>
    "editora": "Editora do Livro"</p>
  }</p>

<li>Atualizar um livro existente</li>
</p>
- PUT '/livros/{id}'</p>
- Descrição: Edita um livro do catálogo.</p>
- Parâmetros: id (ID do livro que você deseja atualizar).</p>
- Corpo da Requisição:</p>
  json</p>
 {</p>
  "titulo": "Novo Título",</p>
  "autor": "Novo Autor",</p>
  "dataPublicacao": "Nova Data de Publicação",</p>
  "editora": "Nova Editora"</p>
}</p>

<li>Excluir um livro</li>
</p>
- DELETE '/livros/{id}'</p>
- Descrição: Remove um livro do catálogo.</p>
- Parâmetros: id (ID do livro que você deseja remover).</p>

 
  </div>
  <h2>Autora:</h2><br/>
<a href="https://github.com/rafaelacostamg">Rafaela Costa👩🏻</a><br>
  
