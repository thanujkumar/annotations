package annotations.java.ex2.inherit;

public enum MyEnumDefaultExtendsEnum {

	ONE(1), TWO(2), THREE(3);

	private int value;

	MyEnumDefaultExtendsEnum(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}
}
