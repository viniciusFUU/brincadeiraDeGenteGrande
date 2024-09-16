public class Fifo {
    private Node cabeca;

    public Fifo(){
        this.cabeca = new Node(0);
    }

    public void add(int elemento){
        Node head = cabeca;
        Node no = new Node(elemento);
        
        while (head.next != null){
            head = head.next;
        }
        
        if(head.next == null){
            head.next = no;
            System.out.println();
        }
    }

    public int remove(){
        int cabecaToExclude = 0;

        if (cabeca != null){
            cabecaToExclude = cabeca.next.data;
            cabeca = cabeca.next;
            System.out.println("Excluindo " + cabecaToExclude);
        }
        return cabecaToExclude;
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
        Fifo fifo = new Fifo();
        fifo.add(2);
        fifo.add(2);
        fifo.add(3);
        fifo.add(4);
        fifo.show();
        fifo.remove();
        fifo.show();
        fifo.remove();
        fifo.show();
        fifo.add(2);
        fifo.show();
    }
}
