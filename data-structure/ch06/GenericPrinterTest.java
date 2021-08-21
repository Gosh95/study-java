package ch06;

public class GenericPrinterTest {

    public static void main(String[] args) {
        GenericPrinter<Tree> printerTree = new GenericPrinter<>();
        printerTree.setMaterial(new Tree());
        Tree tree = printerTree.getMaterial();
        tree.print();

        GenericPrinter<Plastic> printerPlastic = new GenericPrinter<>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic = printerPlastic.getMaterial();
        plastic.print();

        //GenericPrinter<Gold> printerGold = new GenericPrinter<>();
        //Gold는 Material의 싱속을 받지 않기 때문에 에러가 난다.
    }

}
