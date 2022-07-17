package inheritance;

public class BikeActivaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Activa a=new Activa();
		a.setActivaData(110, "4g", "honda");
		a.setBikeData(90000, "gray", "Activa", "50km/h");
		System.out.println(a);
		a.engine();
		
	}

}
