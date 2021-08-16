package ch15;

public class Almond extends CookieDecorator {

	public Almond(Cookie cookie) {
		super(cookie);
	}

	@Override
	public String bake() {
		return super.bake() + " Add Almond";
	}

}
