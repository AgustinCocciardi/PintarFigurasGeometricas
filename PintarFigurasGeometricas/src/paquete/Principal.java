package paquete;

public class Principal {

	public static void main(String[] args) {
		Dibujo dibujo = new Dibujo();
		
		dibujo.agregarFigura(new Cuadrado(1));
		dibujo.agregarFigura(new Cuadrado(1));
		dibujo.agregarFigura(new Cuadrado(1));
		dibujo.agregarFigura(new Cuadrado(1));
		dibujo.agregarFigura(new Cuadrado(1));
		dibujo.agregarFigura(new Circulo(3));
		dibujo.agregarFigura(new Circulo(0.5));
		dibujo.agregarFigura(new Circulo(0.25));
		
		System.out.println("Se necesitan " + dibujo.calcularPomosTempera() 
		+ " pomos de tempera para pintar el dibujo");

	}

}
