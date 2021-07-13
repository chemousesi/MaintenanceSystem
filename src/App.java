public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Client client1 = new Client("chems", "0751307150");

        Entry rep1 = new Entry("001", client1, EquipementType.LAPTOP, Problem.BATTERIE, "sans chergeur");
        rep1.nextStatus();
        rep1.nextStatus();

        System.out.println(rep1);

    }
}
