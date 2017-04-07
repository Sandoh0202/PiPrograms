//Searches for and displays the longest sequence of consecutive prime numbers in the decimal places of pi,
//upto 10,000 decimal places!
import java.io.*;
import java.util.Scanner;
class PrimesInPi
{
	public void work()throws IOException
	{
		String ans="",fin="";
		File f1=new File("piHundred.txt");
		File f2=new File("piThousand.txt");
		File f3=new File("piTenThousand.txt");
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of decimal places: ");
		int n=sc.nextInt(),x,i;
		BufferedReader in=new BufferedReader(new InputStreamReader(new FileInputStream(f3)));
		if(n>0 && n<=100)
			in=new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
		else if(n>100 && n<=1000)
			in=new BufferedReader(new InputStreamReader(new FileInputStream(f2)));

		String str=in.readLine();
		for(i=0;i<str.length();i++)
		{
			x=str.charAt(i);
			if(x==50||x==51||x==53||x==55)
				ans+=(char)x;
			else
			{
				if(ans.length()>fin.length())
					fin=ans;
				ans="";
			}
		}
		System.out.println(fin);
	}
	public static void main(String args[])throws IOException
	{
		PrimesInPi o=new PrimesInPi();
		o.work();
	}
}