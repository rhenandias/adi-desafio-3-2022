# Desafio 3 - Aplicações Distribuídas - ADI

### Desafio

Crie um servidor que irá disponibilizar mensagens aleatórias para os consumidores.
A cada requisição do tipo GET o servidor deverá mostrar uma nova mensagem. Utilizem como exemplo o seguinte tutorial: https://spring.io/guides/gs/consuming-rest/

### Como funciona?

A aplicação é feita em Java utilizando o Spring Boot.

A aplicação realiza o consumo da API Rest de frases aleatórias [Quotable](https://github.com/lukePeavey/quotable).

Ao realizar uma nova chamada na rota ```/random```, é recebido como resposta uma frase aleatória e o seu autor.

### Exemplos

<p align="center">
    <img src="/imgs/img1.png">
</p>

<p align="center">
    <img src="/imgs/img2.png">
</p>

<p align="center">
    <img src="/imgs/img3.png">
</p>