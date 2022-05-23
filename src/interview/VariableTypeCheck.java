package interview;

public class VariableTypeCheck {

	public static void main(String[] args) {
		int a=10;
		byte b=(byte)a;
		System.out.println("type of a: "+((Object)a).getClass().getSimpleName());
		System.out.println("Type of b: "+((Object)b).getClass().getSimpleName());

	}

}
