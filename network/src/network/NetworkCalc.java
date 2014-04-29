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
		String fileName = " ";
		System.out.print("Enter the table  input file:");
		Scanner cscan = new Scanner (System.in);


		fileName = cscan.nextLine();
		File tableInputFile = new File(fileName);
		if (tableInputFile.exists())
		{

			System.out.println("IT LIVES!");

			Scanner tInputFile = new Scanner(tableInputFile);
			String portNumberS;
			String address = null;
			String costS;
			int c = 0;
			int n = 0;
			int portArrayCount = 0;
			int x = 0;

			while(tInputFile.hasNext() && portArrayCount != 7)
			{
				x++;
				System.out.print("address" + x + "\n");
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
	public static void portNum(int portNumber, String subnet, int costNum, int portArrayCount)
	{

		SubnetUtils utils = new SubnetUtils(subnet);
		String[] addresses = utils.getInfo().getAllAddresses();


		if(portArrayCount == 1)
		{
			port1 = addresses.clone();
			for (int i = 0; i < port1.length; i++)
			{
				System.out.print(port1[i] + "\n");
			}
		}
		else if(portArrayCount == 2)
		{
			port2 = addresses.clone();
			for (int i = 0; i < port2.length; i++)
			{
				System.out.print(port2[i] + "\n");
			}
		}
		else if(portArrayCount == 3)
		{
			port3 = addresses.clone();
			for (int i = 0; i < port3.length; i++)
			{
				System.out.print(port3[i] + "\n");
			}
		}
		else if(portArrayCount == 4)
		{
			port4 = addresses.clone();
			for (int i = 0; i < port4.length; i++)
			{
				System.out.print(port4[i] + "\n");
			}
		}
		else if(portArrayCount == 5)
		{
			port5 = addresses.clone();
			for (int i = 0; i < port5.length; i++)
			{
				System.out.print(port5[i] + "\n");
			}
		}
		else if(portArrayCount == 6)
		{
			port6 = addresses.clone();
			for (int i = 0; i < port6.length; i++)
			{
				System.out.print(port6[i] + "\n");
			}
		}
		else if(portArrayCount == 7)
		{
			port7 = addresses.clone();
			for (int i = 0; i < port7.length; i++)
			{
				System.out.print(port7[i] + "\n");
			}
		}
		else
		{
			return;
		}
	}//end portNum


	//checks if the given ip
	public boolean containsIp(String[] port, String address)
	{

		return true;
	}
}