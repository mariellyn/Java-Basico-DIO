// <Tipo> <nomeVariavel> <atribuicaoDeValorOpcional>

// No Java, utilizamos identificadores que representam uma referência (ponteiro)
// a um valor em memória, e esta referência pode ser redirecionada a outro
// valor, sendo portanto esta a causa do nome "variável", pois o valor pode
// variar.

// Já as Constantes, são valores armazenados em memória que não podem ser
// modificados depois de declarados. Em Java, esses valores são representados
// pela palavra reservada final, seguida do tipo.

// Por convenção, Constantes são sempre escritas em CAIXA ALTA.

//int: Representa números inteiros, como 1, 20, -5, etc.

//double: Representa números decimais, ou seja, números com casas decimais, como 3.14, -0.001, 10.5, etc.

//float: Semelhante ao double, mas é usado para números decimais menores. Por exemplo, 3.14f.

//boolean: Pode ter apenas dois valores: verdadeiro (true) ou falso (false).

//char: Representa um único caractere, como 'a', 'B', '@', etc.

//String: Não é um tipo de dado primitivo, mas é usado para armazenar texto, como "Olá, mundo!".

//long: Representa números inteiros maiores do que o tipo int, por exemplo, 100000L.

//short: Similar ao tipo int, mas com um intervalo menor de valores.

//byte: Também armazena números inteiros, mas em um intervalo muito pequeno.

//byte idade = 123;
// short ano = 2021;
//  int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
//  long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
//   float pi = 3.14F;
//  double salario = 1275.33;

public class ExemploVariavel {
    public static void main(String[] args) {

        int numero = 5;

        /*
         * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
         * não é mais necessário, pois a variável já foi declarada anteriormente
         */
        numero = 10;

        System.out.print(numero);

        /*
         * ao usar a palavra reservada final, você determina que jamais
         * esta variavel poderá obter outro valor;
         * logo a linha 25 vai apresentar um erro de compilação
         * isso é considerado uma CONSTANTE na linguagem Java
         */
        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI = 3.15; // Esta linha vai apresentar erro de compilação!
    }
}

class Demo {
    public static void main(String args[]) {
        byte x;
        int a = 270;
        double b = 128.128;
        System.out.println("int converted to byte");
        x = (byte) a;
        System.out.println("a and x " + a + " " + x);
        System.out.println("double converted to int");
        a = (int) b;
        System.out.println("b and a " + b + " " + a);

        System.out.println("\ndouble converted to byte");
        x = (byte) b;
        System.out.println("b and x " + b + " " + x);
    }
}