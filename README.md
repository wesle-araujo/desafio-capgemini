# Desafio Capgemini 👊

# O que é este repositório?
Este repositório é destinado a resolução das três questões-desafio para o programa Academia Capgemini. 

---
## Como rodar o projeto?
Antes de falar como rodar, é importante dizer como o projeto está estruturado. Para isso, deve-se atentar para dois pacotes:
* O primeiro é o pacote questões, dentro do diretório *src/main/java/questoes*. Nele estão localizados todas as classes com as regras de negócio. Ou seja, é o pacote com os métodos para a resolução das questões. Abaixo, vemos uma imagem dele.

![image](https://user-images.githubusercontent.com/77363892/154871201-687bf01f-c37b-41a0-b3c3-df7fac425ee4.png)

* O segundo pacote importante é o pacote com as classes de testes. **É nela que você irá rodar o projeto**. Ela está localizada no diretório *test/java*. Abaixo, vemos uma imagem dele.

![image](https://user-images.githubusercontent.com/77363892/154871429-0c37885e-0a6c-4939-bbe7-ec417021eb90.png)

#### Rodando o projeto
Finalmente, como fazer para rodar e testar as soluções? Para as questões 2 e 3, basta ir ao pacote *test/java* e rodar os testes unitários. Se você quiser modificar a entrada do teste, tem que ir até um método de teste e mudar o valor no construtor da classe da questão. Abaixo, um gif como exemplo para um método de teste. 
![desafio-capgemini](https://user-images.githubusercontent.com/77363892/154872050-9b240fb8-6473-457f-bf11-6958e069011f.gif)

Já para a questão 1, infelizmente, não consegui uma forma de criar um teste unitário. Por isso, vamos no bom e velho **psvm(public static void main)**. Lá você poderá fazer um input por meio do console da sua IDE. 

---
## Questões sobre a estrutura do projeto 
Por ainda ser iniciante nesta área, meus testes unitários ainda não estão muito robustos. Mas estou aberto a feedbacks construtivos para melhorar 😄

Outro ponto é que todas as classes, testes e pacotes estão em pt-br, pois meu conhecimento em inglês ainda está em desenvolvimento. 😞

---
## Tecnologias usadas
#### Para escrita do código 
* JAVA 11 - JDK 17.0.1 
#### Para os testes
* JUnit 5 (para as questões 2 e 3) 
#### Gerenciador de Dependências
* Maven
