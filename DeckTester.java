public class DeckTester {

	public static void main(String[] args) {
		String[] rank1 = {"S", "L", "B"};
		String[] rank2 = {"A", "M", "N"};
		String[] rank3 = {"W", "R", "E"};

		String[] suit1 = {"Shark", "Human", "Tiger"};
		String[] suit2 = {"Cat", "Dog", "Pirhanna"};
		String[] suit3 = {"Panda", "Lizard", "Turkey"};

		int[] value1 = {5, 2, 7};
		int[] value2 = {3, 4, 1};
		int[] value3 = {8, 9, 6};

		Deck one = new Deck(rank1, suit1, value1);
		Deck two = new Deck(rank2, suit2, value2);
		Deck three = new Deck(rank3, suit3, value3);

		for(int i = 0; i < one.size(); i++) {
			one.deal();
			one.size();
		}

		for(int j = 0; j < two.size(); j++) {
			two.deal();
			two.size();
		}

		for(int m = 0; m < three.size(); m++) {
			three.deal();
			three.size();
		}
	}
}
