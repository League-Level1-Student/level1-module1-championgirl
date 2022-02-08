package _02_cat;

public class CatRunner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat cat = new Cat("Moana");
		
		cat.meow();
		
		cat.printName();
		
		cat.kill();
		
while( cat.getLives() > -1 ) {
		//change back to 1 for proper code	
			cat.kill();
			
		}
		
	}

}
