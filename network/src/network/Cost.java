package network;

public class Cost 
{
	String address = "";
	int cost;
	public Cost(String address, int cost)
	{
		setAddress(address);
		setCost(cost);
	}
	
	public void setAddress(String a)
	{
		this.address = a;
	}
	public void setCost(int c)
	{
		this.cost = c;
	}
	
	public int getCost()
	{
		return 0;
	}
}
