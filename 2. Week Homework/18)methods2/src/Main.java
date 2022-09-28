
public class Main {

	public static void main(String[] args) {
		String message ="Today wheater is very good.";
		String newMessage = message.substring(0,3);
		System.out.println(newMessage);
		int number = plus(6,7);
		System.out.println(number);
		int totalResult = plus2(2,3,8,9,6);
		System.out.println(totalResult);
		
	}
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	public static void update() {
		System.out.println("Uptaded");
	} 
	
	public static int plus(int number1 , int number2) {
		return number1 + number2;
	}
	
	public static int plus2(int... numbers) {
		int totalResult =0;
		for (int number:numbers) {
			totalResult+=number;
		}
		return totalResult;
	}
	
	public static String giveCity() {;
	return "Konya";
	}
}


