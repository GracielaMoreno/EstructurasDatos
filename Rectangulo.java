package com.epn;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Rectangulo extends Punto {

	private double base;
	private double altura;
	
	public Rectangulo(String cadena) {
		super("punto del inicio de"+cadena);
		this.altura=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el altura de"+cadena));
		this.base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el base de"+cadena));
	}

	
	public double getBase() {
		return base;
	}


	public void setBase(double base) {
		this.base = base;
	}


	public double getAltura() {
		return altura;
	}

	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void dibujar(Graphics g) {
		
		g.setColor(Color.MAGENTA);
		int x = getX();
		int y = getY();
		g.fillRect(x, y,(int)this.base, (int)this.altura);
		
	}
public double getPerimetro() {
		
		return 2*getAltura()+2*getBase();
	}
	
	public double getVolumen() {
		return 0;
	}
	public double getArea() {
		return getBase()*getAltura();
	}
	
	@Override
	public String toString() {
		return "Rectangulo base=" + base +"\n"+ " altura=" + altura ;
	}

	
	
}

