package videoClub;

public class AppvideoClub {
	public static void main(String[] args) {
		
		DVD dvd1=new DVD("Mulan", DVD.INFANTIL);
		DVD dvd2=new DVD("Casablanca", DVD.NORMAL);
		DVD dvd3=new DVD("Avatar",DVD.NOVEDAD);
		
		Alquiler a1=new Alquiler(dvd1, 2);
		Alquiler a2=new Alquiler(dvd3,4);
		
		Cliente c=new Cliente("María");
		
		c.nuevoAlquiler(a1);
		c.nuevoAlquiler(a2);
		
		c.informeTicket();
		
		
		
	}
}
