package paquete;

public class Cuadrado extends Figura{

	private double lado;
	
	public Cuadrado(double lado){
		this.lado= lado;
	}
	
	@Override
	public double obtenerArea(){
		return Math.pow(lado, 2);
	}

}
