package CardProject;

public class CardLLImp 
{
	private CardLL currentCard;
	private int numCards;
	public static final int TOTALCARDS = 52;
	public static final int RANK = 13;
	public static final int SUIT = 4;
	
	public CardLLImp()
	{
		numCards = 0;
		currentCard = null;
	}
	
	public void setCurrentCard(CardLL c)
	{
		currentCard = c;
	}
	
	public CardLL getCurrentCard() 
	{
		return this.currentCard;
	}

	public int getNumCards() 
	{
		return numCards;
	}
	
	public void addCard(Card c)
	{
		CardLL tempCardLL = new CardLL();
		CardLL tempCCardLL = this.currentCard;
		tempCardLL.setCard(c); 
		
		if(this.currentCard != null)
		{
				if(this.currentCard.getNext() == null)
				{
					this.currentCard.setNext(tempCardLL);
				}
				else
				{
					CardLL tempNext  = this.currentCard.getNext();
					this.currentCard.setNext(tempCardLL);
					tempCardLL.setNext(tempNext);
				}
		}
		else
		{
			this.currentCard = tempCardLL;
			this.currentCard.setNext(null);
		}
		
		this.numCards++;
		
	}
	
	public boolean hasCard(Card c)
	{
		boolean ret = false;
		CardLL temp = this.currentCard;
		
		for(int count = 0; count< numCards; count++)
		{
			if(this.currentCard != null)
			{
				if(this.currentCard.getCard().equals(c))
				{
					ret = true;
				}
				
				this.currentCard = this.currentCard.getNext();
			}
		}
		
		this.currentCard = temp;
		return ret;
	}
	
	public void dealOneCard()
	{
		if(this.currentCard != null)
		{
			System.out.println(this.currentCard.getCard().toString());
			this.currentCard = this.currentCard.getNext();
		}
	}
	
}
