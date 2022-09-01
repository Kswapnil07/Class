import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(10);
		al.add(20);
		
		
		int arr[]=new int [al.size()] ;
		for(int i=0;i<al.size();i++)
		{
			arr[i]=al.get(i);
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
