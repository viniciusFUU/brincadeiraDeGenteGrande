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