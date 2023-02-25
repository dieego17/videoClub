package videoClub;

public class Cliente {
	
	private String nombre;
	private Alquiler alq[];
	int posicion;
	
	public Cliente(String nombre) {
		this.nombre=nombre;
		this.alq=new Alquiler[5];
		this.posicion=0;//El array está vacío
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Alquiler[] getAlq() {
		return alq;
	}

	public void setAlq(Alquiler[] alq) {
		this.alq = alq;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	
	public void nuevoAlquiler(Alquiler a) {
		this.alq[posicion]=a;
		this.posicion++;//indica la posicion donde insertamos el nuevo alquiler
	}
	
	public void informeTicket() {
		double precio=0;
		double total=0;
		int puntos=0;
		System.out.println("Ticket de: "+this.getNombre());
		for(int i=0; i<this.posicion;i++) {
			puntos++;
			switch(this.getAlq()[i].getDvd().getTipo()) {
			case DVD.INFANTIL:
				precio=1.5*this.getAlq()[i].getTiempo();
				break;
			case DVD.NORMAL:
				precio=2*this.getAlq()[i].getTiempo();
				break;
			case DVD.NOVEDAD:
				precio=3*this.getAlq()[i].getTiempo();
				if(this.getAlq()[i].getTiempo()>1)
					puntos++;
				break;
			}
			System.out.println("\t"+this.getAlq()[i].getDvd().getTitulo()+" "+precio+"€");
			total=total+precio;
		}//for
		
		System.out.println("IMPORTE: "+total+"€");
		System.out.println("Puntos: "+puntos);
	}
}
