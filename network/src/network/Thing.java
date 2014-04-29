package network;

public class Thing 
{
	static String subnet;
	static int portNumber;
	static int cost;
	
	public Thing(String subnet, int portNumber, int cost)
	{
		this.setSubnet(subnet);
		this.setPortNumber(portNumber);
		this.setCost(cost);
	}

	private void setSubnet(String subnet) {
		// TODO Auto-generated method stub
		this.subnet = subnet;	
	}

	private void setCost(int cost2) {
		// TODO Auto-generated method stub
		this.cost = cost2;
	}

	private void setPortNumber(int portNumber2) {
		// TODO Auto-generated method stub
		this.portNumber = portNumber2;
	}

	public static String getSubnet() {
		return subnet;
	}
	public static int getPortNumber() {
		return portNumber;
	}
	public static int getCost() {
		return cost;
	}
}
