package com.epn;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Circulo extends Punto {

	private double radio;
	
	public Circulo(String cadena) {
		super("punto del centro de"+cadena);
		this.radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio de"+cadena));
	}

	public Circulo(int x, int y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getDiametro() {
		return 2*this.radio;
	}
	
	public double getCircunferencia() {
		
		return Math.PI*this.getDiametro();
	}
	public double getPerimetro() {
		
		return getCircunferencia();
	}
	
	public void dibujar(Graphics g) {
		
		g.setColor(Color.MAGENTA);
		int x = getX();
		int y = getY();
		g.fillOval(x, y, (int)this.radio, (int)this.radio);
	}
	
	public double getVolumen() {
		return 0;
	}
	public double getArea() {
		return Math.PI*Math.pow(getRadio(), 2);
	}

	@Override
	public String toString() {
		return super.toString()+"\nRadio: " + radio;
	}
}
