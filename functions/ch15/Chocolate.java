package ch15;

public class Chocolate extends CookieDecorator {

	public Chocolate(Cookie cookie) {
		super(cookie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String bake() {
		return super.bake() + " Add Chocolate";
	}

}
