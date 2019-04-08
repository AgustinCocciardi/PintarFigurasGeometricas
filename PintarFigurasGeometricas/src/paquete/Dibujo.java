package paquete;

public class Dibujo {

	private Cuadrado []cuadrados;
	private Circulo []circulos;
	private Triangulo []triangulos;
	private Rectangulo []rectangulos;
	private Figura figuras[]; 
	private static int enUso=0;
	private final int AREA_CUBIERTA= 25;
	
	public Dibujo() {
		this.figuras = new Figura[100];
	}

	public void agregarFigura(Figura figura) {
		this.figuras[enUso]= figura;
		enUso++;
	}
	
	public double calcularPomosTempera(){
		double areaTotal=0;
		for(int i=0; i<enUso; i++) {
			areaTotal+= figuras[i].obtenerArea();
		}
		
		return Math.ceil(areaTotal/AREA_CUBIERTA);
	}

}
