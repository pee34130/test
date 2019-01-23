package test;
public class hello {
	public static void main(String[] arg) {
		System.out.println("Hello\\\"''''''''");
		car carrr = new car();
		carrr.acc=10;
		System.out.println(carrr.acc);
		car c=carrr;
		c.acc=100;
		System.out.println(carrr.acc);
		int a =5;
		int b =a;
		b++;
		System.out.println(b);

	}

}
class car{
	
	int speed;
	int acc;
	
}