package ch11;

public class User implements Buy, Sell {//구현은 여러개 가능 상속은 하나만

	@Override
	public void sell() {
		System.out.println("user sell");
	}

	@Override
	public void buy() {
		System.out.println("user buy");
	}

}
