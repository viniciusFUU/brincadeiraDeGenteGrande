public class App {
    public static void main(String[] args) throws Exception {
        // Lista com cabeça 
        LinkedListComCabeca lista = new LinkedListComCabeca();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.insertAtPosition(3, 7);
        lista.remove(2);
        lista.add(5);

        lista.show();

        //Lista sem cabeca
    }
}
