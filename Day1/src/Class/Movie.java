package Class;

public class Movie 
{
	int yearOfRelease;
	float profit;
	String producerName,actorName;
	
	void acceptDetails(int y,float p,String pn,String an) {
		yearOfRelease=y;
		profit=p;
		producerName=pn;
		actorName=an;
	}
	void showDetails() {
		System.out.println("year of release:"+yearOfRelease);
		System.out.println("movie profit is:"+profit);
		System.out.println("movie producerName:"+producerName);
		System.out.println("movie actor name:"+actorName);
	}
	 public static void main(String[]s) {
		 
		 Movie uri=new Movie();
		 uri.acceptDetails(2010,8564568.00f,"kumar","akashya");
		 uri.showDetails();
	 }
}
