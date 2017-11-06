package systems_of_calculus;

/*
import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
*/

public class one {
	
	public static int start_10(String num, int n) {
		return trek_10(num, num.length() - 1, n, 0, 0);
	}
	
	public static int trek_10(String num, int len_n, int n, int i, int result) {
		result += Integer.valueOf(num.charAt(i)) * Math.pow(n, len_n - i);
		if (i != len_n) { return trek_10(num, len_n, n, i + 1, result); }
		return result;
	}
	
	public static String start_n(int num, int n) {
		return trek_n(num, n, "");
	}
	
	public static String trek_n(int num, int n, String result) {
		int div = num / n;
		int mod = num % n;
		if (num != 0) { return trek_n(div, n, String.valueOf(mod) + result); }
		return result;
	}
	

	public static void main(String[] args) {
		int num1 = start_10("10".trim(), Integer.parseInt("10"));
		int num2 = start_10("10".trim(), Integer.parseInt("10"));
		
		/*
		Map unmodifiableMap = Collections.unmodifiableMap(new HashMap(2, 1.0f){
	        {
	            put("+", num1 + num2);
	            put("-", num1 - num2);
	           	put("*", num1 * num2);
	           	put("/", num1 / num2);
	        }
	    });
		final Map make = unmodifiableMap;
		*/
		
		String result = start_n(num1 + num2, Integer.parseInt("10".trim()));
		System.out.println(result);
	}

}
