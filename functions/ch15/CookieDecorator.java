package ch15;

public abstract class CookieDecorator extends Cookie {
	Cookie cookie;
	
	public CookieDecorator(Cookie cookie) {
		this.cookie = cookie;
	}

	@Override
	public String bake() {
		return cookie.bake();
	}
	
}
