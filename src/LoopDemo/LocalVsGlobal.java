package LoopDemo;

public class LocalVsGlobal {

	String name="ramu";
	int age =25;
	public static void main(String[] args) 
	{
		int i=20;
		LocalVsGlobal lg=new LocalVsGlobal();
		lg.sum();
		System.out.println(i);
		
		System.out.println(lg.name);
		System.out.println(lg.age);
		

	}
	public void sum()
	{
		int i=10;
		int j=20;
		int age=20;
		System.out.println(i+j);
	}

}
