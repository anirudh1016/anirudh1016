package CardProject;

import java.util.*;

public class CardPlay 
{
	private CardLLImp deck;
	
	public CardPlay()
	{
		deck = new CardLLImp();
		shuffle();
		for(int count = 0; count < CardLLImp.TOTALCARDS ; count++)
		{
			deck.dealOneCard();
	    }
	}
	
	private void shuffle()
	{
		do
		{
			int suit = new Random().nextInt(CardLLImp.SUIT);
			int rank = new Random().nextInt(CardLLImp.RANK);
			Card temp = new Card();
			
			if(suit == 0)
			{
				temp.setSuit(Card.Suit.HEARTS);
			}
			else if(suit == 1)
			{
				temp.setSuit(Card.Suit.SPADES);
			}
			else if(suit == 2)
			{
				temp.setSuit(Card.Suit.CLUBS);
			}
			else
			{
				temp.setSuit(Card.Suit.DIAMONDS);
			}
			
			if(rank == 0)
			{
				temp.setRank(Card.Rank.ACE);
			}
			else if(rank == 1)
			{
				temp.setRank(Card.Rank.TWO);
			}
			else if(rank == 2)
			{
				temp.setRank(Card.Rank.THREE);
			}
			else if(rank == 3)
			{
				temp.setRank(Card.Rank.FOUR);
			}
			else if(rank == 4)
			{
				temp.setRank(Card.Rank.FIVE);
			}
			else if(rank == 5)
			{
				temp.setRank(Card.Rank.SIX);
			}
			else if(rank == 6)
			{
				temp.setRank(Card.Rank.SEVEN);
			}
			else if(rank == 7)
			{
				temp.setRank(Card.Rank.EIGHT);
			}
			else if(rank == 8)
			{
				temp.setRank(Card.Rank.NINE);
			}
			else if(rank == 9)
			{
				temp.setRank(Card.Rank.TEN);
			}
			else if(rank == 10)
			{
				temp.setRank(Card.Rank.JACK);
			}
			else if(rank == 11)
			{
				temp.setRank(Card.Rank.QUEEN);
			}
			else
			{
				temp.setRank(Card.Rank.KING);
			}
			
			if(deck.hasCard(temp) == false)
			{
				deck.addCard(temp);
				
			}
			
		} while(deck.getNumCards() != 52);
		
	}

}
