package LoopDemo;

public class Methodoverloading {

	public static void main(String[] args) 
	{
		Methodoverloading obj=new Methodoverloading();
		obj.test();
        obj.test(40);
        obj.test(10, 20);
	}
	public void test()
	{
		System.out.println("print test method");
	}
    public void test(int i)
    {
    	System.out.println("print integer value");
    	System.out.println(i);
    }
    public void test(int j,int k)
    {
    	System.out.println("print two integer value");
    	System.out.println(j+k);
    }
}
