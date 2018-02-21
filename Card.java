package CardProject;

public class Card 
{
	private Rank rank;
	private Suit suit;
	
	public Card()
	{
		rank = Rank.ACE;
		suit = Suit.CLUBS;
	}
	
	public Card(Rank r, Suit s)
	{
		rank = r;
		suit = s;
	}
	
	enum Rank
	{
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;
	}

	enum Suit
	{
		HEARTS, CLUBS, DIAMONDS, SPADES;
	}
	
	public void setSuit(Suit s)
	{
		suit = s;
	}
	
	public void setRank(Rank r)
	{
		rank = r;
	}
	
	public Suit getSuit()
	{
		return suit;
	}
	
	public Rank getRank()
	{
		return rank;
	}
	
	public boolean equals(Card c)
	{
		boolean ret = false;
		if(c.rank == this.rank && c.suit == this.suit)
		{
			ret = true;
		}
		return ret;
	}
	
	@Override
	public String toString()
	{
		String ret;
		StringBuffer temp = new StringBuffer();
		temp.append("("+rank+","+suit+")");
		ret = temp.toString();
		return ret;
	}
	
}
