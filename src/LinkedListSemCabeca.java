public class LinkedListSemCabeca {
    private Node head;

    public void add(int data){
        Node novoValor = new Node(data);

        if(head == null){
            head = novoValor;
        } else {
            Node atual = head;

            while (atual.next != null) {
                atual = atual.next;   
            }

            atual.next = novoValor;
        }
    }

    public void show(){
        Node cabeca = head;

        if (head == null){
            System.out.println("Lista vazia"); 
        }

        while (cabeca != null) {
            System.out.print(cabeca.data + ", ");
            cabeca = cabeca.next;
        }
        System.out.println("null");

    }
}
