package containmentComparator;


public class Movie implements Comparable<Movie> {

	int mid,boxofficeCollection,rating;
	String mname;
	
	
	Movie(int mid,int boxofficeCollection,String mname,int rating)
	{
		this.mid=mid;
		this.boxofficeCollection=boxofficeCollection;
		this.mname=mname;
		this.rating=rating;
		
	}
	public String toString () {
		return mid+" "+boxofficeCollection+" "+mname+" "+rating;
	}
	public int compareTo(Movie e)
	{
		if(this.rating>e.rating)
			return 1;
		else if(this.rating<e.rating)
			return -1;
		
			else
				return 0;
				
	}
	
	

}
