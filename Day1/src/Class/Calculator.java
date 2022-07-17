package Class;

public class Calculator {
	int a=20;
	int b=10;
	void add() {
	
	System.out.println("addition"+(a+b));
	}
	void mul() {
		System.out.println("mul"+(a*b));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator c1=new Calculator(); 
		Calculator c2=new Calculator(); 
			c1.add();
			c2.mul();
			
		}
	}

