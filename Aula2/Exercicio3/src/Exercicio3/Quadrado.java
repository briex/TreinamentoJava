package Exercicio3;

public class Quadrado {
private double lado;

public double getLado() {
	return lado;
}

public void setLado(double lado) {
	this.lado = lado;
}

public double area() {
	double area;
	
	area = lado * lado; 
	return area;
	
}
public double perimetro(){
	double area;
	
	area = (4*lado);
	
	return area;
	
}




}
