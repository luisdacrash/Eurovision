package Main;

public class Country 
{
	String name;
	String countryToVote;
	int puntuation;
	
	/**
	 * Constructor
	 * @param name
	 * @param countryToVote
	 * @param puntuation
	 */
	public Country(String name, String countryToVote, int puntuation) 
	{
		super();
		this.name = name;
		this.countryToVote = countryToVote;
		this.puntuation = puntuation;
	}
	
	//Function to get a random puntuation
	public static int randomPuntuation() 
	{
		int result = 0;
		do
		{
			result = (int) Math.random();
		}while(result == 9 || result == 11 || result>=13);
		return result;
	}
	
	//Getters And Setters
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getCountryToVote() 
	{
		return countryToVote;
	}
	public void setCountryToVote(String countryToVote) 
	{
		this.countryToVote = countryToVote;
	}
	
	public int getPuntuation() 
	{
		return puntuation;
	}
	public void setPuntuation(int puntuation) 
	{
		this.puntuation = puntuation;
	}
	
	//To String
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Country [name=");
		builder.append(name);
		builder.append(", countryToVote=");
		builder.append(countryToVote);
		builder.append(", puntuation=");
		builder.append(puntuation);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
