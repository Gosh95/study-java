package ch12;

public class CarFactoryTest {

    public static void main(String[] args) {//singleton + static 활용
        CarFactory factory = CarFactory.getInstance();
        Car tesla = factory.createCar();
        Car porsche = factory.createCar();

        System.out.println(tesla.getCarNum()); //100
        System.out.println(porsche.getCarNum()); //101
    }

}
