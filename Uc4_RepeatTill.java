package Day_4_Assignment;

public class Uc4_RepeatTill {

	/**
	 * Repeat till the player reaches the wining position 100.
	 * Note in case the player postion moves below 0,then the player restarts
	 * from 0. 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1 = 10, no2 = 20,res ;
		String  symbol= "--";
		
		switch (symbol) {
		case "+" : res = no1+no2;
		System.out.println("res");
		break;
		
		case "-" : res = no1-no2;
		System.out.println("res");
		break;
		
		case "*" : res = no1*no2;
		System.out.println("res");
		break;
		
		case "/" : res = no1/no2;
		System.out.println("res");
		break;
		
		default: 
		System.out.println("Game over!");
		break;
		}
	}
}
