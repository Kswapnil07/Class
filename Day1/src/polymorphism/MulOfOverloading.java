package polymorphism;

public class MulOfOverloading {

	void mul(int a,int b) {
		System.out.println("mul of 2 num:"+(a*b));
	}
	void mul(int a,int b,int c) {
		System.out.println("mul of 3 num:"+(a*b*c));
	}
	void mul(float a, float b) {
		System.out.println("mul of 2 num:"+(a*b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MulOfOverloading m=new MulOfOverloading();
		m.mul(15, 13);
		m.mul(5f, 5f);
		m.mul(6, 6, 6);
	}

}
