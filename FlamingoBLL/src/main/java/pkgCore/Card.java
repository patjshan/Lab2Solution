package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	public eRank Rank;
	public eSuit Suit;
	
	
	public Card(eSuit Suit, eRank Rank){
		this.Rank = Rank;
		this.Suit = Suit;
	}
	
	
	
	//			Add a private 'setter' method for eRank and eSuit
	
	public eRank getRank() {
		return Rank;
	}



	public eSuit getSuit() {
		return Suit;
	}


	private void SetSuit(eSuit Suit){
		this.Suit = Suit;
	}
	
	private void SetRank(eRank Rank){
		this.Rank = Rank;
	}

	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return 0;
		//return c.geteRank().compareTo(this.geteRank());

}
	
}
