public class Recursao {
    static long fatorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    static long fatorialDuplo(int n) {
        if (n == 1)
            return 1;
        return n * fatorialDuplo(n - 2);
    }

    static int fibonacci(int n) {
        if (n < 3)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static double protenciaLaco(int base, int expoente) {
        if (expoente == 0)
            return 1;
        if (expoente < 0) {
            base = 1 / base;
            expoente = -expoente;
        }
        double pot = base;
        for (int i = 1; i < expoente; pot *= base, i++)
            ;
        return pot;
    }

    static int potenciaRec1(int base, int i, int expoente) {
        if (i == expoente)
            return base;
        return base * potenciaRec1(base, i + 1, expoente);
    }

    static int potenciaRec2(int base, int expoente) {
        if (expoente == 0)
            return 1;
        return base * potenciaRec2(base, expoente - 1);
    }

    // construir um metodo recursivo para somar valores de 1 a n.
    static int soma1aNrec(int n) {
        if (n < 1)
            return n;
        return n + soma1aNrec(n - 1);
    }

    // construir um metodo iterativo para somar os digitos de um numero
    static int somaDigitosIter(int n) {
        int soma = 0;
        while (n > 0) {
            soma += n % 10;
            n = n /= 10;
        }
        return soma;
    }

    // construir um metodo recursivo para somar oos digitos de um numero
    static int somaDigitoRec(int n) {
        if (n == 0)
            return 0;
        return n % 10 + somaDigitoRec(n / 10);
    }

    // fazer a soma dos elementos de um vetor
    static int somaVetRec(int[] v, int pos) {
        if (pos == v.length)
            return 0;
        return v[pos] + somaVetRec(v, pos + 1);
    }

    // faça uma função recursiva que receba um numero inteiro positivo impar N e
    // retorne o fatorial duplo desse numero
    // O fatorial duplo é definido como o produto de todos os numeros naturais
    // impares de 1 até algum numero natural impar N. Assim
    // o fatorial duplo de 5 é 5!! = 1+3+5 = 15
    static int fatorialDuploRec(int N) {
        if (N == 1)
            return 1;
        if (N % 2 == 0)
            return 0;
        return N + fatorialDuploRec(N - 2);
    }

    public static void main(String[] args) {
        // for (int i = 0; i < 30; i++) {
        // System.out.println("fatorial de " + i + " = " + fatorial(i));
        // }
        // for (int i = 1; i < 48; i++) {
        // System.out.println("Fibonacci de " + i + " : " + fibonacci(i));
        // }
        System.out.println("3 a quarta =  " + protenciaLaco(3, 04));
        System.out.println("3 a 4 =  " + protenciaLaco(3, -4));
        System.out.println("3 a quarta =  " + potenciaRec1(3, 1, 4));
        System.out.println("3 a quarta =  " + potenciaRec2(3, 4));
    }
}
