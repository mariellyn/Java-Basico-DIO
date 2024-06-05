# Princípios da programação orientada a objetos

Esses são os quatro princípios fundamentais do paradigma de programação orientada a objetos. Entendê-los é essencial para se tornar um programador de sucesso.

- Encapsulamento
- Herança
- Abstração
- Polimorfismo

Agora, vamos dar uma olhada neles com mais detalhes.

## Encapsulamento

Encapsulamento é um processo de envolver dados e código em uma única unidade.

É como uma cápsula que possui uma mistura de diversos medicamentos, é uma técnica que ajuda a manter as variáveis de instância protegidas.

Essa proteção pode ser conquistada utilizando o modificador de acesso `private`, que indica que a variável ou dado não pode ser acessado de fora da classe. Para acessar estados privados de modo seguro, temos que providenciar métodos `getters` e `setters` públicos (em Java, esses métodos devem seguir os padrões de nomenclatura "JavaBeans").

Digamos que existe uma loja de discos que vende álbuns de músicas de diferentes artistas e um estoque para o gerenciamento.

### Exemplo sem encapsulamento

```java
public class Album {
    public String name;
    public String artist;
    public double price;
    public int numberOfCopies;
    public void sellCopies(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println("Um album foi vendido!");
        }
        else{
            System.out.println("Não há álbuns disponíveis!");
        }
    }
    public void orderCopies(int num){
        numberOfCopies += num;
    }
}

public class StockKeeper {
    public String name;
    public StockKeeper(String name){
        this.name = name;
    }
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
        album.name = name;
        album.artist = artist;
        album.price = price;
        album.numberOfCopies = numberOfCopies;

        System.out.println("Album gerenciado por :" + this.name);
        System.out.println("Detalhes do album::::::::::");
        System.out.println("Nome do album: " + album.name);
        System.out.println("Artista do Album : " + album.artist);
        System.out.println("Preço do Album : " + album.price);
        System.out.println("Número de cópias do album : " + album.numberOfCopies);
    }
}

public class Main {
    public static void main(String[] args) {
       StockKeeper johnDoe = new StockKeeper("John Doe");
       johnDoe.manageAlbum(new Album(), "Slippery When Wet", "Bon Jovi", -1000.00, -50);
    }
}

Saída:


Album gerenciado por :John Doe
Detalhes do album::::::::::
Nome do album : Slippery When Wet
Artista do Album : Bon Jovi
Preço do Album :  -1000.0
Número de cópias do album : -50

O preço do álbum e número de cópias não podem ser valores negativos. Como podemos evitar essa situação? Aqui é onde usamos o encapsulamento.

Exemplo com encapsulamento

public class Album {
    private String name;
    private String artist;
    private double price;
    private int numberOfCopies;
    public void sellCopies(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println("Um álbum foi vendido!");
        }
        else{
            System.out.println("Nenhum álbum disponível!");
        }
    }
    public void orderCopies(int num){
        numberOfCopies += num;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        if(numberOfCopies > 0) {
            this.numberOfCopies = numberOfCopies;
        }
        else {
            this.numberOfCopies = 0;
        }
    }
}

public class StockKeeper {
    private String name;
    StockKeeper(String name){
        setName(name);
    }
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies){
        album.setName(name);
        album.setArtist(artist);
        album.setPrice(price);
        album.setNumberOfCopies(numberOfCopies);

        System.out.println("Album gerenciado por :"+ getName());
        System.out.println("Detalhes do album::::::::::");
        System.out.println("Nome do album : " + album.getName());
        System.out.println("Artista do Album : " + album.getArtist());
        System.out.println("Preço do Album : " + album.getPrice());
        System.out.println("Número de cópias do album : " + album.getNumberOfCopies());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        StockKeeper johnDoe = new StockKeeper("John Doe");
        johnDoe.manageAlbum(new Album(), "Slippery When Wet", "Bon Jovi", -1000.00, -50);
    }
}


Saída:

Album gerenciado por :John Doe
Detalhes do album::::::::::
Nome do album : Slippery When Wet
Artista do Album : Bon Jovi
Preço do Album : 0.0
Número de cópias do album : 0


Com o encapsulamento, impedimos nosso gerenciador de estoque de definir valores negativos, o que significa que temos o controle sobre as informações.

Vantagens do encapsulamento em Java
Podemos fazer uma classe somente leitura ou somente escrita: Para uma classe somente leitura, temos que informar apenas os métodos getters. Para uma classe somente escrita, devemos informar apenas os métodos setters.
Controle sobre os dados: Podemos controlar os dados adicionando lógica nos métodos setters, assim como fizemos para evitar que o gerenciador de estoques definisse valores negativos nos exemplos acima.
Proteção dos dados: Outras classes não podem acessar membros privados de uma classe diretamente.
Herança
Consideremos que a loja de discos que falamos anteriormente também venda filmes em Blu-ray.

Exemplo de herança

public class Album {
    private String name;
    private String artist;
    private double price;
    private int numberOfCopies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }
}

public class Movie extends Album {
    private String director;
    private int duration;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

Vantagens de se usar herança
Reaproveitamento de código: As classes filhas herdam todos os membros de instância da classe pai.
Flexibilidade: Mudar o código em um lugar é o suficiente.
Polimorfismo: A sobrescrita de métodos requer um relacionamento "É UM".
Abstração
Abstração é o processo de esconder os detalhes de implementação e exibir apenas as funcionalidades para o usuário.

Exemplo de classe abstrata

abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Círculo!");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
    }
}


Quando usar classes abstratas?
Para forçar subclasses a implementar métodos abstratos.
Para impedir que existam objetos daquela classe.
Para manter a referência à uma classe.
Para manter código comum.
Interfaces
Uma interface é um template (ou uma "planta" de construção) de uma classe.

Exemplo de interface

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Círculo!");
    }
}

public class InterfaceChecker {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
    }
}


Vantagens das interfaces
Nos ajudam a utilizar herança múltipla no Java.
Elas fornecem abstração.
Elas fornecem baixo acoplamento entre as classes.
Diferença entre interface e classe abstrata
Interfaces são implementadas enquanto classes abstratas são estendidas.
Interfaces não podem conter métodos não implementados, enquanto classes abstratas podem.
Interfaces podem conter apenas métodos e variáveis estáticos finais.
Polimorfismo
Existem dois tipos de polimorfismo em Java:

Polimorfismo em tempo de compilação (sobrecarga de métodos)
Polimorfismo em tempo de execução (sobrescrita de métodos)
Sobrecarga de método
Sobrecarga de método é um conceito onde uma classe pode ter mais de um método com o mesmo nome, mas com diferentes assinaturas.

Exemplo de sobrecarga de método

public class Adder {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }
}

public class TestOverloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(12.3, 12.6));
    }
}

Sobrescrita de método
A sobrescrita de método permite que uma classe filha forneça uma implementação específica de um método que já é fornecido por uma de suas classes ancestrais.

Exemplo de sobrescrita de método

class Vehicle {
    void run() {
        System.out.println("Veículo está correndo");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike está correndo");
    }
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();
    }
}

