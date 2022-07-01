package polymorphism;



	class Sem1
	{
		public Sem1()
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
	class Sem2 extends Sem1
	{
		int java,dbms,ds;
		public Sem2()
		{
			System.out.println("sem2 costructor");
		
		}
		
		
		public void input2()
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
	
	class Sem3 extends Sem2
	{
		int html,css,php;
		public Sem3()
		{
			System.out.println("sem3 costructor");
		
		}
		
		
		public void input3()
		{
			html=54;
			css=48;
			php=75;
		}
		public void output3()
		{
			System.out.println("result of sem2\n\n");
			System.out.println("marks in html "+ html);
			System.out.println("marks in css"+ css);
			System.out.println("marks in php"+ php);
			System.out.println("----------------------\n\n");
		}
	}
	class MultilevelInheitance
	{
		public static void main(String args[])
		{
			Sem3 obj=new Sem3();
			obj.input();
			obj.input2();
			obj.input3();
			
			obj.output();
			obj.output2();
			obj.output2();
	}

	}
