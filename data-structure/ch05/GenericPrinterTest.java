package ch05;

public class GenericPrinterTest {

    public static void main(String[] args) {
        //ObjectType
        ObjectPrinter printer = new ObjectPrinter();
        printer.setMaterial(new Tree());
        Tree t = (Tree) printer.getMaterial(); //Object로 할 시 형변환을 해줘야 한다.
        System.out.println(t.toString()); //재료는 Tree 입니다.

        //GenericType(T)
        GenericPrinter<Tree> printerTree = new GenericPrinter<>();
        printerTree.setMaterial(new Tree());
        Tree tree = printerTree.getMaterial();
        System.out.println(tree.toString()); //재료는 Tree 입니다.

        GenericPrinter<Plastic> printerPlastic = new GenericPrinter<>();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic = printerPlastic.getMaterial();
        System.out.println(plastic.toString()); //재료는 Plastic 입니다.
    }

}
