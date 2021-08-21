package ch08;

public class Person { //this
    String name;
    int age;

    public Person() {
        this("name", 20); //밑에 Person을 가리킴
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this; //메모리 주소를 반환
    }

    public String showPerson() {
        return name + ", " + age;
    }

    public static void main(String args[]) {
        Person person = new Person();
        System.out.println(person.showPerson());

        System.out.println(person.getPerson());

    }

}
