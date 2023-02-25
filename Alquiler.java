package videoClub;

public class Alquiler {
	private DVD dvd;
	private int tiempo;
	
	//constructor por defecto
	public Alquiler() {
		this.dvd=new DVD();
		this.tiempo=0;
	}
	
	//constructor con todos los parámetros
	public Alquiler(DVD dvd, int tiempo) {
		this.dvd = dvd;
		this.tiempo = tiempo;
	}
	public DVD getDvd() {
		return dvd;
	}
	public void setDvd(DVD dvd) {
		this.dvd = dvd;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}
	
}


