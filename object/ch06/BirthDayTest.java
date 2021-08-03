package ch06;

public class BirthDayTest {

	public static void main(String[] args) {
		Date christmas = new Date();
		
		christmas.setYear(2020);
		christmas.setMonth(12);
		christmas.setDay(25);
		
		christmas.showDate(); //2020년 12월 25일
		
		Date invalidDate = new Date();
		invalidDate.setYear(2020);
		invalidDate.setMonth(15);
		invalidDate.setDay(33);
		
		invalidDate.showDate(); //유효하지 않은 날짜입니다.
	}

}
