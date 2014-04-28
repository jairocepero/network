package network;

import java.io.File;

public class NetworkCalc
{
	//arrays will serve as storage for the ip range for each AS
	//int as# will serve as storage for the AS number
	//in cost# will serve as storage for the cost of each provided CDIR
	public static String [] AS1; public static int as1; public static int cost1;
	public static String [] AS2; public static int as2; public static int cost2;
	public static String [] AS3; public static int as3; public static int cost3;
	public static String [] AS4; public static int as4; public static int cost4;
	public static String [] AS5; public static int as5; public static int cost5;
	public static String [] AS6; public static int as6; public static int cost6;
	public static String [] AS7; public static int as7; public static int cost7;
	
	//main
	public static void main (String args[])
	{
		
		File inputFile = new File ("./addressinputfile1FIX.txt");
		
		ASNum("200.34.55.0/24", 1);
		for (int i = 0; i < AS1.length; i++)
		{
			System.out.print(AS1[i] + "\n");
		}
		
		
	}//end of main
	
		//receives a CIDR(subnet) address and AS number to create an array with AS number
		//the AS number comes from the file as well as the CDIR(subnet)
		public static void ASNum(String cidr, int ASNumber)
		{
			
			SubnetUtils utils = new SubnetUtils(cidr);
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
		
		
		//checks if the given ip is in the array containing a ip range
		public boolean containsIp(String[] AS, String address)
		{
			boolean contains = false;
			String addressToCheck = address;
			for(String s  : AS)
			{
				if(s.compareToIgnoreCase(addressToCheck) == 0)
				{
					contains = true;
					return contains;
				}	
			}
			return contains;
		}	
}
