package defaultConstructor;

public class Account {
	
	long accno;
	String custoname;
	Account(){}
	
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public long getaccno() {
		return accno;
	}
	public void setCustoname(String custoname) {
		this.custoname=custoname;
	}
	public String getcustomername() {
	   return custoname;
	}
	
	public String toString() {
		return accno+" "+custoname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a1=new Account();
		a1.setAccno(984563288);
		a1.setCustoname("swapnil");
		System.out.println(a1);
		
		
	}

}
