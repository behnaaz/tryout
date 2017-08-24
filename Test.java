import java.util.Map;
import java.util.HashMap;

public class Test {
	private Map<String, String> something = new HashMap<>(); 

	public Test() {
		something.put("yek", "1");
	}

	public Map<String, String> getSomething() {
		return something;
	} 

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("Salam donya" + test.getSomething());
		System.out.println("Salam donya" + test.getSomething().get("yek"));
		Map<String, String> temp = test.getSomething();
		System.out.println("Salam donya" + temp);
		System.out.println("Salam donya" + temp.get("yek"));
		temp.put("yek", "een");	
		System.out.println("Salam donya" + temp);
		System.out.println("Salam donya" + temp.get("yek"));
	}
}
