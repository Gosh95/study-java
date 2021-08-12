package ch06;

public class GenericPrinter<T extends Material> {
	//GenericType에 원하는 타입만 들어올 수 있게 제한을 걸 수 있다.
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
}
