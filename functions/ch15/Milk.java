package ch15;

public class Milk extends CookieDecorator {

    public Milk(Cookie cookie) {
        super(cookie);
    }

    @Override
    public String bake() {
        return super.bake() + " Add Milk";
    }

}
