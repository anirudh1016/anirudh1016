package CardProject;

public class CardLL 
{
	private CardLL next;
	private Card card;
	
	public CardLL()
	{
		next = null;
		card = null;
	}
	
	public void setCard(Card c)
	{
		card = c;
	}
	
	public Card getCard()
	{
		return card;
	}
	
	public void setNext(CardLL c)
	{
		this.next = c;
	}
	
	public CardLL getNext()
	{
		return next;
	}
	
	public boolean hasNext()
	{
		boolean ret = false;
		
		if(this.next != null)
		{
			ret = true;
		}
		
		return ret;
	}
}
