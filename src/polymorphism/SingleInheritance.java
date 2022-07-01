package polymorphism;
class Sem21
{
	public Sem21()
	{
		System.out.println("sem1 costructor");
	
	}
	int math,c,cpp;
	void input()
	{
		math=50;
		c=45;
		cpp=75;
	}
	public void output()
	{
		System.out.println("result of sem1\n\n");
		System.out.println("marks in math "+ math);
		System.out.println("marks in c "+ c);
		System.out.println("marks in cpp "+ cpp);
		System.out.println("----------------------\n\n");
	}
}
class Sem22 extends Sem21
{
	int java,dbms,ds;
	public Sem22()
	{
		System.out.println("sem2 costructor");
	
	}
	
	
	void input2()
	{
		java=54;
		dbms=48;
		ds=75;
	}
	public void output2()
	{
		System.out.println("result of sem2\n\n");
		System.out.println("marks in java "+ java);
		System.out.println("marks in dbms "+ dbms);
		System.out.println("marks in ds "+ ds);
		System.out.println("----------------------\n\n");
	}
}
class SingleInheritance
{
	public static void main(String args[])
	{
		Sem22 obj=new Sem22();
		obj.input();
		obj.input2();
		obj.output();
		obj.output2();
}

}