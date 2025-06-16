/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author ???
 * @version ???
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- ???
	2. Print deck (simple)
	- ???
	*
	*/
	public static void main(String[] args) {
		Card[] deck = new Card[52];
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array
		for (int i = 0; i < 13; i++) {
			deck[i] = new Card(i + 1, Card.HEART);
			deck[i+13] = new Card(i + 1, Card.DIAMOND);
			deck[i+26] = new Card(i + 1, Card.CLUB);
			deck[i+39] = new Card(i + 1, Card.SPADE);
		}

		//2. Print deck
		System.out.println();
		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 13; i++) {
				System.out.print(deck[i+(j*13)] + " ");
			}
			System.out.println();
		}
//		for (int j = 0; j < 4; j++) {
//			for (int i = 0; i < 13; i++) {
//				deck[i+(j*13)].printCard();
//				System.out.println();
//			}
//		}

	}
}