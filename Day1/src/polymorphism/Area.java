package polymorphism;

public class Area {

	void area(float a ,float b) {
		System.out.println(a*b);
	}
	void area(int a) {
		System.out.println(a*a);
	}
	void area(double a) {
		double z=3.14* a*a;
		System.out.println(z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a=new Area();
		a.area(5f, 4f);
		a.area(6d);
		a.area(6);
	}

}
