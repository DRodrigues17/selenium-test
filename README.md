# selenium-test
Repositório contendo minha primeira experiencia com testes automatizados utilizando selenium

não se esqueça de baixar o selenium e o chrome driver para conseguir executar os testes, o selenium é uma biblioteca que deve ser adcionada ao projeto (não é possivel via maven) e o chrome driver deve ser baixado na mesma versão do seu navegador. Segue abaixo o link de onde baixar ambos:
- https://www.selenium.dev/downloads/
- https://chromedriver.chromium.org/home


Na pasta src/test/java você verá todos os arquivos correspondentes aos testes. Existe uma subpasta chamada pages, na qual estão os "objetos" por assim dizer,
as classes Page nesse projeto são classes que eu utilizei para criar os métodos que navegam na página, veja o nome deles e entenderá o que estou falando:

![image](https://user-images.githubusercontent.com/91800053/204422905-de0f2fdf-60d7-4218-afd9-4341f3da2079.png)


Já as classes Test são as classes que chamam esses métodos e executam o teste, veja o exemplo abaixo, a classe abre o browser na linha 20 e depois no método 
da linha 26 elachama os métodos da classe "BuscaPages" seguindo um passo a passo esperado para atingir o resultado esperado.

![image](https://user-images.githubusercontent.com/91800053/204423243-fceaf745-e485-448d-a59a-c4dc1265ea14.png)


Segue abaixo um video executando os testes:

https://youtu.be/kU-ikogRjAE
