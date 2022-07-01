package polymorphism;
class MethodOverloading 
{
	public void area(int side)
	{
		int result=side*side;
		System.out.println("area of square is "+ result);
	}
	public void area(int length,int width)
	{
		int result=length*width;
		System.out.println("area of rectangle is "+ result);
	}
public void area(double pi,int r)
{
	double result=pi*r*r;
	System.out.println("area of circle is "+ result);
	
	}
	public static void main(String[] args)
	{
		MethodOverloading obj=new MethodOverloading();
		obj.area(10);
		obj.area(10,20);
		obj.area(3.14,15);
	}

}
