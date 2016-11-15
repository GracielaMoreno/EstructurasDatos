package com.epn;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
public class Linea extends Punto{ 
	private double longitud;
	
	public Linea(String cadena) {
		super("punto del un extremo"+cadena);
	
		this.longitud = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la longitud de"+cadena));
			}

	public Linea(int x, int y, double longitud) {
		super(x, y);
		this.longitud = longitud;
	}
	
	public double getRadio() {
		return longitud;
	}

	public void setLinea(double longitud) {
		this.longitud = longitud;
	}
public double getLinea() {
		
		return 0;
	}
	public double getPerimetro() {
		
		return getLinea();
	}
	
public void dibujar(Graphics g) {
		
		g.setColor(Color.MAGENTA);
		int x = getX();
		int x2 =getX();
		int y = getY();
		int y2 = getY();
		g.drawLine(x, y, x2, y2);
	}
	
public double getVolumen() {
	return 0;
}
public double getArea() {
	return 0;
}

	
	@Override
	public String toString() {
		return super.toString()+"\nLongitud: " + longitud;
	}
	
	
	


}
