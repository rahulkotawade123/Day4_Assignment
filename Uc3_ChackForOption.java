package Day_4_Assignment;

public class Uc3_ChackForOption {

	 public static  int diceRoll () {
			int a = (int) ((Math.floor(Math.random()*10)%6)+1);
			return a;
			}
		
		public static  int genratePlayerOption() {
			int b = (int) ((Math.floor(Math.random()*10)%3)+1);
			return b;
		}
	 public static void main(String[] args, Object res) {
			// TODO Auto-generated method stub
		 //int playerPosition;
		 //int startPosition = 0;
		 //int diceValue = diceRoll();
	    // int optionPlayers = genratePlayerOption();
	     
	    int a = 0;
		int b = 0;
		switch (b) {
	     
	     case 1: res = a+b;
	       System.out.println(res+"play snake");
	     break;
	     
	     case 2: res = a-b;
	       System.out.println(res+"play ladder");
	     break;
	     
	     default: 
	       System.out.println("position snake is zero");
	     
	     
	     }		 
	 }
}