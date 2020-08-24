<h1>Exercício - Classes abstratas.</h1>

Você deve modelar um sistema de delivery com os seguintes critérios:
- Todos os lanches derivam da classe Lanche
- Todo lanche tem preço
- existem 3 tipos de lanches: sanduíche, massa e bolo
- todo sanduíche deve receber um vetor de até 10 ingredientes
- todas as massas têm o atributo molho
- existem 3 tipos de massas: macarrão, pizza e lasanha
- O bolo tem os atributos massa, recheio e cobertura
- cada lanche leva aproximadamente 10 min por km de distância para ser
entregue
- sanduíches tem tempo de preparo de 15 min
- massas em geral demoram 30 min para ficarem prontos.
- bolos geralmente levam 10 min de preparo.

No programa principal o usuário deve receber um menu podendo escolher entre as
opções [1] sanduíches, [2] massas, [3] bolos.

Após fazer a seleção cada opção deve levar para um submenu para escolher os
ingredientes do lanche selecionado.

No final o menu deve perguntar qual a sua distância do restaurante, calcular o preço e
o tempo de chegada do lanche até a sua casa.
