package _06_duck;

public class Duck {

	public Duck() {
		// TODO Auto-generated constructor stub
	}

	int numberOfFriends;

	String favoriteFood;

	int numberOfFamilyMembers;

	String FavoritSpecies;

	void quack() {

	}

	void waddle() {

	}

	void carrots() {

		System.out.println("Sia nibbles on a carrot");
		
		
	}

	void hops() {

		System.out.println("Sia hops around the garden ");
		
	}

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

}
