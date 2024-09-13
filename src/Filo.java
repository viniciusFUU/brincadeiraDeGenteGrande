public class Filo {
    private Node cabeca;
    
    public Filo(){
        this.cabeca = new Node(0);
    }

    public void add(int elemento){
        Node head = cabeca;
        Node no = new Node(elemento);

        while(head.next != null){
            head = head.next;
        }

        if (head.next == null){
            head.next = no;
        }
    }

    public int remove(){
        Node head = cabeca;
        int numeroExcluido = 0;

        if (head.next == null){
            numeroExcluido = head.data;
            cabeca = null;

            return numeroExcluido;
        }

        while (head.next.next != null) {
            head = head.next;
        }

        numeroExcluido = head.next.data;
        head.next = null;

        return numeroExcluido;
    }



    public void show(){
        Node aposHead = cabeca.next;

        if(aposHead == null){
            System.out.println("Lista vazia");
        }

        while (aposHead != null) {
            System.out.print(aposHead.data + ", ");
            aposHead = aposHead.next;
        }
            System.out.println("null");
    }

    public static void main(String[] args) {
        Filo filo = new Filo();
        filo.add(1);
        filo.add(2);
        filo.add(3);
        filo.show();
        filo.remove();
        filo.show();
        filo.add(3);
        filo.show();
    }
}
