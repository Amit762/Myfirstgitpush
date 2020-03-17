package LoopDemo;

public class TwoDimentionalArray {

	public static void main(String[] args) 
	{
		int x[][]=new int[3][5];
		System.out.println(x.length);
		System.out.println(x[1].length);
		x[0][0]=10;
		x[0][1]=20;
		x[0][2]=30;
		x[0][3]=40;
		x[0][4]=50;
		System.out.println(x[0][4]);
		x[1][0]=60;
		x[1][1]=70;
		x[1][2]=80;
		x[1][3]=90;
		x[1][4]=100;
		
		x[2][0]=110;
		x[2][1]=120;
		x[2][2]=130;
		x[2][3]=140;
		x[2][4]=150;
		
		/*x[3][0]=210;
		x[3][1]=220;
		x[3][2]=230;
		x[3][3]=240;
		x[3][4]=250;
		*/
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<4;j++)
			{
			System.out.println(x[i][j]);	
			}
		}
		
	}

}
