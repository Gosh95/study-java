package ch10;

public class EmployeeTest {

    public static void main(String[] args) {
        //static은 메모리를 공유한다. 공유하기 때문에 employee2에서 증가시키면 employee1의 serialNum 값도 증가함
        //static은 클래스 이름으로 쓰는게 좋다. ex) Employee.serialNum
        Employee employee1 = new Employee();
        System.out.println(employee1.serialNum); //1000

        Employee employee2 = new Employee();
        employee2.serialNum++;

        System.out.println(employee2.serialNum); //1001
        System.out.println(employee1.serialNum); //1001
    }

}
