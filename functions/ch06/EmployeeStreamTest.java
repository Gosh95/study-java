package ch06;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStreamTest {

    public static void main(String[] args) {
        Employee kim = new Employee("kim", 5, 5000);
        Employee lee = new Employee("lee", 1, 1000);
        Employee jun = new Employee("jun", 10, 10000);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(kim);
        employeeList.add(jun);
        employeeList.add(lee);

        System.out.println("직원 정보");
        employeeList.stream().forEach(s -> System.out.println(s.toString()));
		/*
			이름 : kim 경력 : 5년 연봉 : 5000만원
			이름 : jun 경력 : 10년 연봉 : 10000만원
			이름 : lee 경력 : 1년 연봉 : 1000만원
		 */

        System.out.println();

        System.out.println("경력 5년 이상인 직원 이름(오름차 정렬)");
        employeeList.stream().filter(a -> a.getCareer() >= 5).map(s -> s.getName()).sorted().forEach(s -> System.out.println(s));
//		jun
//		kim

        System.out.println();
        System.out.println("모든 직원의 연봉 합계");
        int total = employeeList.stream().mapToInt(a -> a.getAnnualSalary()).sum();
        System.out.println(total + "만원");
//		16000만원
    }

}
