package website;
class A
{
	double cc;
	A(double cc)
	{
		this.cc=cc;
		System.out.println("A object is created");
	}
	public void combution() 
	{
		System.out.println("Power generated");
	}
}
class B
{
	double mileage;
	A obj1;
	B(double mileage)
	{
		this.mileage=mileage;
		System.out.println("B object is created");
	}
	public void drive(double cc) 
	{
		obj1=new A(cc);
		System.out.println("Long Drive");
	}
}

public class Composition 
{
	public static void main(String[] args) 
	{
		B obj=new B(20);
		obj.drive(100);
		
	}
}
