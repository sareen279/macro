import java.util.*;
import java.io.*;

public class macro1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String mn[] = new String[50];
		String md[] = new String[50];
		String ala[] = new String[50];
		int mi[] = new int[50];
		int mn1 = 0,md1 = 0,ala1 = 0,w = 0;
		String q = "";
		System.out.println("Enter file name");
		String fn = s.nextLine();
		try
		{
			BufferedReader b = new BufferedReader(new FileReader(fn));
			String s1;
			while((s1 = b.readLine()) != null)
			{
				if(s1.equals("MACRO"))
				{
					s1 = b.readLine();
					int x = s1.indexOf(" ");
					mn[mn1] = s1.substring(0,x);
					mi[mn1] = md1+1;
					q = q + s1.substring(x+1,s1.length()) + ",";
					w = q.length();
					while(!s1.equals("MEND"))
					{
						md[md1] = s1;
						s1 = b.readLine();
						md1++;
					}
					md[md1] = "MEND\n";
					md1++;
					mn1++;
				}
				ala = q.split(",");
				ala1 = ala.length;
			}
		}
		catch(Exception e)
		{

		}
		System.out.println("MNT");
		System.out.println("Name\tMDTIndex");
		for(int i = 0;i < mn1;i++)
		{
			System.out.println(mn[i] + "\t" + mi[i]);
		}
		System.out.println("MDT");
		System.out.println("MDefinition");
		for(int i = 0;i < md1;i++)
		{
			System.out.println(md[i]);
		}
		System.out.println("ALA");
		System.out.println("Arguments");
		for(int i = 0;i < ala1;i++)
		{
			System.out.println(ala[i]);
		}
	}
}