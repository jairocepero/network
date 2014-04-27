package network;

public class NetworkCalc
{
	//private static String subnet = "200.34.55.0/24";
	//private String adr = "";
	//private String address = "";	
	public static String [] AS1;
	public static String [] AS2;
	public static String [] AS3;
	public static String [] AS4;
	public static String [] AS5;
	public static String [] AS6;
	public static String [] AS7;
	
	public static void main (String args[])
	{
		
		ASNum("200.34.55.0/24", 1);
		for (int i = 0; i < AS1.length; i++)
		{
			System.out.print(AS1[i] + "\n");
		}
		
		
	}
		//receives a CIDR(subnet) address and AS number to create an array with AS number
		//the AS number comes from the file as well as the CDIR(subnet)
		public static void ASNum(String subnet, int ASNumber)
		{
			
			SubnetUtils utils = new SubnetUtils(subnet);
			String[] addresses = utils.getInfo().getAllAddresses();
			
			
			if(ASNumber == 1)
			{
				AS1 = addresses.clone();
			}
			else if(ASNumber == 2)
			{
				AS2 = addresses.clone();
			}
			else if(ASNumber == 3)
			{
				AS3 = addresses.clone();
			}
			else if(ASNumber == 4)
			{
				AS4 = addresses.clone();
			}
			else if(ASNumber == 5)
			{
				AS5 = addresses.clone();
			}
			else if(ASNumber == 6)
			{
				AS6 = addresses.clone();
			}
			else if(ASNumber == 7)
			{
				AS7 = addresses.clone();
			}
			else
			{
				return;
			}
		}//end ASNum
		
		
		//checks if the given ip
		public boolean containsIp(String[] AS, String address)
		{
			
			return true;
		}	
}
