package LoopDemo;

public class arraytutorial {

	public static void main(String[] args) 
	{
		int i[]=new int [4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[2]);
		System.out.println(i.length);
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}

		double d[]= new double[3];
		d[0]=23.11;
		d[1]=21.65;
		d[2]=13.76;
		for(int k=0;k<d.length;k++)
		{
			System.out.println(d[k]);
		}
		String s[]=new String[4];
		s[0]="Amit";
		s[1]="Archana";
		s[2]="Mona";
		
		for(int g=0;g<s.length;g++)
		{
			System.out.println(s[g]);
		}
		
		Object ob[]= new Object[4];
		ob[0]=10;
		ob[1]="JAN";
		ob[2]=1985;
		ob[3]="10/01/1988";
		for(int t=0;t<ob.length;t++)
		{
			System.out.println(ob[t]);
		}
		
		
	}

}
