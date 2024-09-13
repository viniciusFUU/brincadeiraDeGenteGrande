public class LinkedListComCabeca {
    private Node cabeca;

    public LinkedListComCabeca(){
        this.cabeca = new Node(-1);
    }

    public void add(int data){
        Node head = cabeca;
        Node novoNo = new Node(data);

        while (head.next != null) {
            head = head.next;
        }

        head.next = novoNo;
    }

    public void remove(int data){
        Node head = cabeca;

        while (head.next != null && head.next.data != data) {
            head = head.next;
        }

        if(head.next.data == data && head.next != null){
            head.next = head.next.next;
        }
    }

    public void insertAtPosition(int apos, int elemento){
        Node head = cabeca.next;
        Node prox = null;
        
        while(head.data != apos && head != null){
            System.out.println(head.data);            
            if(head.data != apos){
                head = head.next;
            }
        }

        if(head.data == apos){
            Node no = new Node(elemento);
            no.next = head.next;
            head.next = no;
        }
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
            System.out.print("null");
    }

}