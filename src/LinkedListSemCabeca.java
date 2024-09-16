public class LinkedListSemCabeca {
    private Node primeiro;

    public void add(int elemento) {
        Node novoValor = new Node(elemento);

        if (primeiro == null) {
            primeiro = novoValor;
            return;
        } 

        Node substituto = primeiro;

        while (substituto.next != null) {
            substituto = substituto.next;
        }

        substituto.next = novoValor;
    }

    public void insertAtPosition(int apos, int elemento){
        Node novoValor = new Node(elemento);

        while(primeiro.data != apos){
            primeiro = primeiro.next;
        }

        if(primeiro.data == apos){
            novoValor.next = primeiro.next;
            primeiro.next = novoValor;
        }
    }

    public void removeElemento(int elemento){
        if (primeiro.data == elemento){
            primeiro = primeiro.next;
        }

        Node atual = primeiro;

        while (atual.next != null && atual.next.data != elemento) {
            atual = atual.next;
        }

        if (atual.next != null && atual.next.data == elemento){
            atual.next = atual.next.next;
        }
    }

    public void show() {
        if (primeiro == null) {
            System.out.println("Lista vazia");
            return;
        }

        Node temp = primeiro;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListSemCabeca semCabeca = new LinkedListSemCabeca();
        semCabeca.add(2);
        semCabeca.add(3);
        semCabeca.show();
        semCabeca.insertAtPosition(2, 7);
        semCabeca.show();
        semCabeca.removeElemento(3);
        semCabeca.show();
    }
}
