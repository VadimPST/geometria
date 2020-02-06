/**
 * 
 * @author Vadim Postnov
 * @version 1.2
 * 
 *
 */


public class Triangulo_VP extends FiguraGeometrica_VP {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * Asigna los valores a los lados
	 */
	public Triangulo_VP(String tipoFigura, double lado_1, double lado_2, double lado_3) {
		super(tipoFigura);
		lado1 = lado_1;
		lado2 = lado_2;
		lado3 = lado_3;
	}

	/**
	 * Sobrescribe el metodo de calculo, para calcular correctamente el perimetro de un triangulo
	 * @return double perimtero del triangulo
	 */
	@Override
	public double perimetro() {
		return lado1 + lado2 + lado3;
	}
	/**
	 * Sobrescribe el metodo de calculo, para calcular correctamente el area de un triangulo,
	 * @return double area del triangulo
	 */
	@Override
	public double area() { //Utiliza la formula de Her—n
		double sp;
		sp = this.semiPerimetro();
		return Math.sqrt(sp * (sp-lado1) * (sp-lado2) * (sp-lado3));
	}
	

}
