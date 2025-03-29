public class Pilha {
    Carta[] baralho;
    int topo;

    // Construtor da pilha
    public Pilha() {
        baralho = new Carta[52]; // Cria uma pilha com 52 cartas
        topo = 0; // Inicializa o topo da pilha
    }

    // Método que verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == 0;
    }

    // Método que verifica se a pilha está cheia
    public boolean isFull() {
        return topo == baralho.length;
    }

    // Método que adiciona uma carta à pilha
    public boolean push(Carta c) {
        if (isFull()) {
            return false; // Não pode adicionar mais cartas se a pilha estiver cheia
        }
        baralho[topo++] = c; // Adiciona a carta no topo da pilha
        return true;
    }

    // Método que remove e retorna a carta do topo da pilha
    public Carta pop() {
        if (isEmpty()) {
            return null; // Não pode remover carta se a pilha estiver vazia
        }
        return baralho[--topo]; // Remove a carta do topo e decrementa o índice
    }

    // Método que retorna a representação em String da pilha
    @Override
    public String toString() {
        if (isEmpty()) {
            return "Mão vazia";
        }
        StringBuilder s = new StringBuilder("-----------------------------\n");
        for (int i = topo - 1; i >= 0; i--) {
            s.append(baralho[i]).append("\n"); // Adiciona cada carta na String
        }
        s.append("-----------------------------\n");
        return s.toString();
    }

    // Método espião: devolve a carta que está no topo da pilha
    public Carta peekCarta() {
        if (isEmpty()) {
            return null; // Retorna null se a pilha estiver vazia
        }
        return baralho[topo - 1]; // Retorna a carta do topo sem removê-la
    }

    // Método que retorna o tamanho da pilha
    public int tamanhoPilha() {
        return topo; // O tamanho é igual ao valor do topo
    }

    // Método que busca uma carta na pilha e retorna sua posição (1 para o topo)
    public int search(Carta c) {
        for (int i = topo - 1; i >= 0; i--) {
            if (c.equals(baralho[i])) {
                return topo - i; // Retorna a posição da carta na pilha
            }
        }
        return -1; // Retorna -1 se a carta não for encontrada
    }
}
