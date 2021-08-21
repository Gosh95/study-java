package ch04;

public class Passenger { //생성자 Constructor
    String passengerName;
    String passportNumber;
    String birthDay;
    String address;

    public Passenger() {
    } //기본 생성자(default)

    public Passenger(String passengerName, String passportNumber, String birthDay, String address) {
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String showPassengerInfo() {
        return "승객 이름 : " + passengerName + "\n여권 번호 : " + passportNumber + "\n생년 월일 : " + birthDay + "\n주소 : " + address;

    }
}
