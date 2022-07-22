class Rectangle
{
	int length,width;

	void getdata(int x,int y)
	{
		length=x;
		width=y;
	}

int area()
    	{
		return (length * width);
    	}
}

class Pgm1a
{
	public static void main( String args[])
	{
		int area1,area2;
		Rectangle rect1= new Rectangle();
		Rectangle rect2= new Rectangle();                   //Creating objects
		rect1.length=15;                                   //Accessing variables
		rect1.width=10;
		area1=rect1.length * rect1.width;

		rect2.getdata(20,12);                             //Accessing methods
		area2=rect2.area();
		System.out.println("Area1="+area1);
		System.out.println("Area2="+area2);

	}
}
