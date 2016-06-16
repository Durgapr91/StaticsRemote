
public class TestBox {
Integer i=2;
int j=1;
int one=20456654;
double two=100567890.248907;

public static void main(String[] args)
{
	int one=20456654;
	double two=100567890.248907;
	double d=42.5;
	String doubleString=Double.toString(d);
	System.out.println(doubleString);
	TestBox t=new TestBox();
	t.go();
	String s=String.format("the rank is %,d out of %,.2f",one,two);
	System.out.println(s);
	
}
public void go()
{
	j=i;
	System.out.println(j);
	System.out.println(i);
}
}
