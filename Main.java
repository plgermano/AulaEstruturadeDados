public class Main {

    public static void main(String[] args) {
        Vetor v1 = new Vetor(5);
        Vetor v2 = new Vetor(5);

    }
}

class Vetor {
    private int ocupacao;
    private int[] v;

    public Vetor(int tamanho) {
        v = new int[tamanho];
        ocupacao = 0; // legibilidade
    }
}
