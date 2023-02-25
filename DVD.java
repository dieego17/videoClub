package videoClub;

public class DVD {
	//Constantes
		public static final int NORMAL=0;
		public static final int NOVEDAD=1;
		public static final int INFANTIL=2;
		
		private String titulo;
		private int tipo;
		//Constructor por defecto
		public DVD() {
			this.titulo="";
			this.tipo=0;
		}
		//Constructor con todos los parámetros
		public DVD(String titulo, int tipo) {
			this.titulo=titulo;
			this.tipo=tipo;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public int getTipo() {
			return tipo;
		}
		public void setTipo(int tipo) {
			this.tipo = tipo;
		}
		@Override
		public String toString() {
			return "DVD [titulo=" + titulo + ", tipo=" + tipo + "]";
		}
		
}
