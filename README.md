# ExerciciosJava

documentação JAVA : https://www.oracle.com/java/technologies/javase-jdk8-doc-downloads.html

download NetBeans: https://netbeans.org/downloads/old/8.2/

<p> Objeto: Coisa material ou abstrata que pode ser percebida pelos sentidos e descrita por meio das suas características (ATRIBUTO), comportamentos (MÉTODO) e estado atual (ESTADO).</p>
<p> Exemplo de objeto: Caneta</p>


<p>Classe (MOLDE DO OBJETO) caneta: Atributos -> Coisas que eu tenho? (modelo, cor, ponta, carga, tampada),
                  Métodos -> coisas que eu faço? (escreve, rabiscar, pintar,tampar,destampar) e
                  Estado -> como estou agora? (50% carga, ponta fina, azul, escrevendo e destampada) </p>


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
