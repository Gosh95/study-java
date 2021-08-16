package ch15;

public class CookieTest {

	public static void main(String[] args) {
		Cookie cookie = new MyCookie();
		System.out.println("Cookie : " + cookie.bake());
		//Cookie : My Cookie
		
		Cookie milkCookie = new Milk(new MyCookie());
		System.out.println("Milk MyCookie : " + milkCookie.bake());
		//Milk MyCookie : My Cookie Add Milk
		
		Cookie chocolateCookie = new Chocolate(new MyCookie()); 
		System.out.println("Chocolate MyCookie : " + chocolateCookie.bake());
		//Chocolate MyCookie : My Cookie Add Chocolate
		
		Cookie almondCookie = new Almond(new MyCookie());
		System.out.println("Almond MyCookie : " + almondCookie.bake());
		//Almond MyCookie : My Cookie Add Almond
	}

}
