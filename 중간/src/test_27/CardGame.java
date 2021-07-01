package test_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Card {
	String suit, number;

	public Card() {

	}
	
	public Card(String suit, String number) {
		this.suit = suit;
		this.number = number;
	}

	public String toString() {
		return "(" + suit + " " + number + ")";
	}
}

class Deck {

	// code
	ArrayList<Card> deck = new ArrayList<>();
	

	String[] suit = { "CLUB", "DIAMOND", "HEART", "SPADE" };

	String[] number = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public Deck() {
		Random random = new Random();
		
		// ī�� 52�� ����
		for(int i=0; i<52; i++) {
			// �ߺ����Ű� �ʿ��ϴ�
			
			int rSuit = random.nextInt(4);
			int rNumber = random.nextInt(13);
			
			Card card = new Card(suit[rSuit], number[rNumber]);
			deck.add(card);
		}
	}

	public void Shuffle() {

		Collections.shuffle(deck);
	}

	public Card deal() {

		return deck.remove(0);
	}
}

class Player{
	//code
	
	ArrayList<Card> list = new ArrayList<>();
	
	public void getCard(Card card) {
		// �ڵ�
		list.add(card);
	}
	
	
	public void showCards() {
		System.out.println(list);
	}
}


public class CardGame {

	public static void main(String[] args) {

		Deck deck = new Deck();
		deck.Shuffle();
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		p1.getCard(deck.deal());
		p2.getCard(deck.deal());
		
		p1.showCards();
		p2.showCards();
		
	}

}
