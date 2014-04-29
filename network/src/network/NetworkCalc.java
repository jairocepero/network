package network;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class NetworkCalc
{	
	public static String [] port1;
	public static String [] port2;
	public static String [] port3;
	public static String [] port4;
	public static String [] port5;
	public static String [] port6;
	public static String [] port7;

	public static void main (String args[]) throws FileNotFoundException
	{
		//filenames are hardcoded
		String fileName = "tableinputfile1FIX.txt";
		File tableInputFile = new File(fileName);
		if (tableInputFile.exists())
		{
			Scanner tInputFile = new Scanner(tableInputFile);
			String portNumberS;
			String address = null;
			String costS;
			int c = 0;
			int n = 0;
			int portArrayCount = 0;

			while(tInputFile.hasNext() && portArrayCount != 7)
			{
				portArrayCount++;
				portNumberS = tInputFile.next();
				address= tInputFile.next();
				costS = tInputFile.next();

				c = Integer.parseInt(costS);
				n = Integer.parseInt(portNumberS);

				portNum(n, address, c, portArrayCount);

			}
		}
	}

	//receives a CIDR(subnet) address and port number to create an array with port number
	//the port number comes from the file as well as the CDIR(subnet)
	public static void portNum(int portNumber, String subnet, int costNum, int portArrayCount) throws FileNotFoundException
	{

		SubnetUtils utils = new SubnetUtils(subnet);
		String[] addresses = utils.getInfo().getAllAddresses();


		if(portArrayCount == 1)
		{
			port1 = addresses.clone();
			containsIp(port1, portNumber, costNum);
			
		}
		else if(portArrayCount == 2)
		{
			port2 = addresses.clone();
			containsIp(port2, portNumber, costNum);
		}
		else if(portArrayCount == 3)
		{
			port3 = addresses.clone();
			containsIp(port3, portNumber, costNum);
		}
		else if(portArrayCount == 4)
		{
			port4 = addresses.clone();
			containsIp(port4, portNumber, costNum);
		}
		else if(portArrayCount == 5)
		{
			port5 = addresses.clone();
			containsIp(port5, portNumber, costNum);
		}
		else if(portArrayCount == 6)
		{
			port6 = addresses.clone();
			containsIp(port6, portNumber, costNum);
		}
		else if(portArrayCount == 7)
		{
			port7 = addresses.clone();
			containsIp(port7, portNumber, costNum);
		}
		else
		{
			return;
		}
	}//end portNum


	//checks if the given ip
	public static boolean containsIp(String[] port, int portNum, int costNum) throws FileNotFoundException
	{
		//filenames are hardcoded
		String fileName = "addressinputfile1FIX.txt";
		File addressInputFile = new File(fileName);
		if (addressInputFile.exists())
		{
			Scanner tInputFile = new Scanner(addressInputFile);

			while(tInputFile.hasNext())
			{
				String addr = tInputFile.nextLine();
				for(String s : port)
				{
					if(s.compareToIgnoreCase(addr) == 0)
					{
						System.out.println(addr + " " + portNum);
					}
				}
			}
			
		}
		return true;
	}
}