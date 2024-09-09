public class App {
    public static void main(String[] args) throws Exception {
        LinkedListComCabeca lista = new LinkedListComCabeca();
        LinkedListSemCabeca listSemCabeca = new LinkedListSemCabeca();

        listSemCabeca.add(1);
        listSemCabeca.add(1);
        listSemCabeca.add(1);

        listSemCabeca.show();
    }
}
