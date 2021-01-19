# ExerciciosJava

documentação JAVA : https://www.oracle.com/java/technologies/javase-jdk8-doc-downloads.html

download NetBeans: https://netbeans.org/downloads/old/8.2/

<p> Objeto: Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características (ATRIBUTO), comportamentos (MÉTODO) e estado atual (ESTADO).</p>
<p> Exemplo de objeto: Caneta</p>


<p>Classe (MOLDE DO OBJETO) caneta: Atributos -> Coisas que eu tenho? (modelo - BIC CRISTAL, cor - AZUL, ponta - 0.5, carga - 90, tampada - FALSO),
                  Métodos -> coisas que eu faço? (escrever - , rabiscar, pintar,tampar,destampar) e
                  Estado -> como estou agora? (50% carga, ponta fina, azul, escrevendo e destampada) </p>
Definição Classe: Define os atributos e métodos comuns que serão compartilhados por um objeto.
Definição Objeto: é uma instância de uma classe.


Classe Caneta
      modelo: caractere
      cor: caractere
      ponta:Real
      carga:inteiro
      tampada:lógico
      
Metodo rabiscar()
    Se (tampada) entao
      Escreva ("ERRO")
    senao
      Escreva("Rabisco")
    FimSe 
FimMetodo

Metodo tampar()
    tampada = verdadeiro
FimMetodo

fimClasse

Classe --> objeto (instanciar)
c1 = nova Caneta
c1.cor = "Azul"
c1.ponta = 0.5
c1.tampada = false
c1.rabiscar()

c2.nova Caneta
c2.cor = "Vermelho"
c1.ponta = 1.0
c1.tampada = false
c1.tampar()


