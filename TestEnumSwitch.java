public class TestEnumSwitch {
	private ABCEnum abc;
	enum ABCEnum {
		A,
		B,
		C
	}


	public String printEnum() {
		switch (abc) {
			case A:
				return "A";
			case B:
				return "B";
			case C:
				return "C";
			default:
				return "NULL";
		}
	}

	public static void main(String[] args) {
		System.out.println("Test");
		String res = new TestEnumSwitch().printEnum(); 
		System.out.println(res);
	}
}
