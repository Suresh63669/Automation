package uma;

public class Ex1 {

	public static StringBuilder show(String str ) {
		int length = str.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<=length-6;i++) {
			sb.append("*");
		}
		sb.append(str.substring(length-6));
		return sb;
		
	}
	public static void main(String[] args) {
		String str = "1234567890123456";
		System.out.println(show(str));
	}

}
