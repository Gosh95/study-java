package ch11;

public class CompanyTest {

    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        //싱글톤은 하나만 생성되기 때문에 두 객체의 주소는 같다
    }

}
