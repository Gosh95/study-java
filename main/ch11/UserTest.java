package ch11;

public class UserTest {

    public static void main(String[] args) {
        User user = new User();

        user.buy();
        user.sell();
        user.buyBook();
        user.sellBook();

        Buy buyer = user; //재정의 되어 user의 메소드로 나온다

        buyer.buy();
        buyer.buyBook();

        Sell seller = user;  //재정의 되어 user의 메소드로 나온다

        seller.sell();
        seller.sellBook();
    }

}
