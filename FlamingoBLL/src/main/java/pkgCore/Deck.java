package pkgCore;

import java.util.ArrayList;

import pkgEnum.eRank;
import pkgEnum.eSuit;

public class Deck {

	private static ArrayList<Card> cards;

	public Deck(int n) {
		int x = 0;
		while (x < n){
			for(eSuit Suit: eSuit.values()){
				for(eRank Rank : eRank.values()){
					cards.add(new Card(Suit,Rank));
				}
			}
			++x;
		}
	}
	
	
	
	
	
	
	
	public static Card draw(){
		 return cards.remove(0);
	}
	
}
