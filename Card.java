public class Card{
	protected String CardName;
	protected String Description;
	
	public Card(){
		CardName = "";
		Description = "";
		}
	
	public Card(String Name, String desc){
		CardName = Name;
		Description = desc;
		}
		
	public void PlayCard(){}

	public String getCardName(){ return CardName; }
	public String getDescription(){ return Description; }
	
	public String toString(){
		String S = getCardName() + "\n" + getDescription();
		return S;
	}	
}