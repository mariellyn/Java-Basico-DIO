<h1>- Desafio - Controle de Fluxo </h1>

<p>Este projeto implementa um cenário onde um sistema recebe dois parâmetros via terminal, representando dois números inteiros. Com esses números, o programa realiza uma contagem e imprime os números incrementados no console.</p>

<h3>Funcionalidades:</h3>
<ul>
  <li>O sistema solicita dois números inteiros como entrada via terminal.</li>
  <li>Com base nos números fornecidos, o programa realiza uma contagem e imprime os números incrementados.</li>
  <li>Se o primeiro parâmetro for maior que o segundo, uma exceção customizada, <code>ParametrosInvalidosException</code>, é lançada com a mensagem "O segundo parâmetro deve ser maior que o primeiro".</li>
</ul>

<h3>Como usar:</h3>
<ol>
  <li>Clone este repositório em sua máquina local.</li>
  <li>Compile o projeto.</li>
  <li>Execute o programa e siga as instruções para fornecer os dois parâmetros.</li>
</ol>

<h3>Estrutura do Projeto:</h3>
<ul>
  <li><strong>DesafioControleFluxo</strong>: Nome do projeto.</li>
  <li><strong>Contador.java</strong>: Classe que contém a lógica principal do programa.</li>
  <li><strong>ParametrosInvalidosException.java</strong>: Classe que representa a exceção customizada.</li>
</ul>

<h3>Explicação do Código:</h3>

<h4>Classe ParametrosInvalidosException:</h4>
<ul>
  <li>Cria uma exceção customizada que herda de <code>Exception</code>.</li>
  <li>Tem um construtor que aceita uma mensagem de erro, que é passada para a superclasse.</li>
</ul>

<h4>Classe Contador:</h4>
<ul>
  <li>Utiliza um <code>Scanner</code> para receber os dois parâmetros do usuário.</li>
  <li>Tenta chamar o método <code>contar</code> com os parâmetros fornecidos.</li>
  <li>Caso <code>ParametrosInvalidosException</code> seja lançada, imprime a mensagem de erro.</li>
  <li>O método <code>contar</code> verifica se o primeiro parâmetro é maior ou igual ao segundo. Se for, lança a exceção <code>ParametrosInvalidosException</code>.</li>
  <li>Se os parâmetros forem válidos, calcula a diferença entre os parâmetros e imprime os números incrementados de 1 até a diferença.</li>
</ul>
