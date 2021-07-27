class Rectangle
{       //Attributes
	private int l,b;
	//Behaviour
	public void showDimention()
	{
		System.out.println("Lenght="+l);
		System.out.println("Breadth="+b);

	}
	public int area()
	{
		return l*b;
	}
	public void setDimention(int x,int y)
	{
		l=x;
		b=y;
	}
}
class RectTest
{

	public static void main(String[] ar)
	{
		Rectangle r=new Rectangle();
		r.setDimention(2,4);
		r.showDimention();
		System.out.println("Area of rectangle"+r.area());
	}
} 