
public class Circulo_VP extends FiguraGeometrica_VP {
	private double radio;
	//Constante pi
	static final double PI = 3.1416;
	
	public Circulo_VP(double r, String tipoFigura) {
		super(tipoFigura);
		if(radio<0) {
			radio=radio+(radio*2);
		}
		radio = r;
	}

	@Override
	public double area() {
		return radio * radio * PI;

	}
	
	@Override
	public double perimetro() {
		return radio * 2 * PI;
	}

}
