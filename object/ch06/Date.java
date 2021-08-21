package ch06;

public class Date {
	/*
	접근 제어 지시자
	클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를 지정하는 키워드
	private = 같은 클래스 내부에서만 접근 가능
	protected = 같은 패키지나 상속 관계의 클래스에서 접근 가능하고 외부에서는 접근 불가
	public = 클래스의 외부 어디서나 접근 가능
	아무것도 없음(default) = 같은 패키지 내부에서만 접근 가능
	 */

    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 31 || day < 1) {
            this.isValid = false;
        } else {
            isValid = true;
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 12 || month < 1) {
            this.isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1) {
            isValid = false;
        } else {
            isValid = true;
            this.year = year;
        }
    }

    public void showDate() {
        if (isValid == true) {
            System.out.println(year + "년 " + month + "월 " + day + "일");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
