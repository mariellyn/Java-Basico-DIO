### Princípios de Programação Orientada a Objetos

A programação orientada a objetos é um paradigma de programação onde tudo é representado como um objeto.

Objetos passam mensagens uns para os outros. Cada objeto decide o que fazer com uma mensagem recebida. A POO (em inglês, OOP - Object Oriented Programming) foca nos estados e comportamentos de cada objeto.

#### O que são objetos?

Um objeto é uma entidade que possui estados e comportamentos.

Por exemplo, cão, gato e veículo. Para ilustrar, um cão possui estados como idade, cor, nome e comportamentos como comer, dormir e correr.

Os estados nos dizem como o objeto se parece ou quais propriedades ele possui.

O comportamento nos diz o que o objeto faz.

Podemos representar um cão do mundo real em um programa como um objeto de software definindo seus estados e comportamentos.

Objetos de software são uma representação de um objeto do mundo real. É alocado espaço em memória sempre que um objeto lógico é criado.

Um objeto pode também ser referenciado como uma instância de uma classe. Instanciar uma classe significa a mesma coisa que criar um objeto.

Algo importante de se lembrar quando estamos criando um objeto é: o tipo de referência deve ser do mesmo tipo ou um supertipo do tipo do objeto. Veremos o que é um tipo de referência mais a frente neste artigo.

#### O que são classes?

Uma classe é um template - algo como a "planta" de uma construção - a partir do qual os objetos são criados.

Imagine uma classe como um cortador de biscoitos e os objetos como os próprios biscoitos.


![alt text](image.png)

### Classes, Variáveis de Instância e Métodos de Instância

Classes definem estados como variáveis de instância e comportamentos como métodos de instância.

Variáveis de instância também são conhecidas como "variáveis membro".

Classes não consomem espaço em memória.

### Exemplo: Classe Cat (Gato)

Para exemplificar o conceito de classes e objetos, vamos criar uma classe `Cat` (Gato) que representa estados e comportamentos de um gato no mundo real.

```java
public class Cat {
    // Variáveis de instância
    private String name;
    private int age;
    private String color;

    // Construtor
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Métodos de instância
    public void meow() {
        System.out.println("O gato " + name + " está miando.");
    }

    public void sleep() {
        System.out.println("O gato " + name + " está dormindo.");
    }

    // Outros métodos...
}


### Criando Objetos da Classe Cat

Agora que definimos um template de gatos, vamos dizer que temos dois gatos, chamados Thor e Rambo. Como podemos defini-los em nossos programas?

Primeiro, precisamos criar dois objetos da classe `Cat`.

```java
public class Main {
    public static void main(String[] args) {
       Cat thor = new Cat();
       Cat rambo = new Cat();
    }
}

### Agora, vamos definir seus estados e comportamentos.

```java
public class Main {

    public static void main(String[] args) {
       /*
       Criando os objetos
        */
       Cat thor = new Cat();
       Cat rambo = new Cat();

       /*
       Definindo o gato Thor
        */
       thor.name = "Thor";
       thor.age = 3;
       thor.breed = "Azul russo";
       thor.color = "Marrom";

       thor.sleep();

       /*
       Definindo o gato Rambo
        */
       rambo.name = "Rambo";
       rambo.age = 4;
       rambo.breed = "Maine Coon";
       rambo.color = "Marrom";

       rambo.play();
    }

}


