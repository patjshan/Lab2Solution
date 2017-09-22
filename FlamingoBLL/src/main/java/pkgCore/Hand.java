package pkgCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	

	public int[] ScoreHand(){	
		int aces = 0;
		Collections.sort(cards);
		for (Card c: cards){
			if (c.getRank() == pkgEnum.eRank.ACE){
				++aces;
			}
			else{}
		}	
	
		int[] iScore = new int[(aces + 1)];
				
		for (int i = 0;i <=aces;i++){
			iScore[i] = aces + 10*i;
		}
		for (Card c: cards){
			for (int x = 0; x < iScore.length; x++){
				if (c.getRank() != pkgEnum.eRank.ACE & c.getRank().getiRankNbr() > 10){
				iScore[x] = iScore[x] + 10;
				}
				else if (c.getRank() != pkgEnum.eRank.ACE){
					iScore[x] = iScore[x] + c.getRank().getiRankNbr();
				}
				else{}
			}
		}
		for (int x: iScore){
			if (x == 21){
				int[] winner = new int[1];
				winner[0] = 21;
				return winner;
			}
			else if (x > 21 && aces > 0){
				int j = Arrays.binarySearch(iScore, x);
				return Arrays.copyOfRange(iScore, 0, j);
				
			}
			else{}
		}
		return iScore;
	}
		
//	
	public void Draw(Deck d)
	{
		Card c = Deck.draw();
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
