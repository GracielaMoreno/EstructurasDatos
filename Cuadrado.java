package com.epn;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class Cuadrado extends Punto {

	private double lado;
	
	
	public Cuadrado(String cadena) {
		super("punto del inicio de"+cadena);
		this.lado=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado de"+cadena));
			}

	
	
	public double getLado() {
		return lado;
	}



	public void setLado(double lado) {
		this.lado = lado;
	}



	public void dibujar(Graphics g) {
		
		g.setColor(Color.MAGENTA);
		int x = getX();
		int y = getY();
		g.fillRect(x, y,(int)this.lado, (int)this.lado);
		
	}
public double getPerimetro() {
		
		return 4*getLado();
	}
	
	public double getVolumen() {
		return 0;
	}
	public double getArea() {
		return getLado()*getLado();
	}


	@Override
	public String toString() {
		return "Cuadrado lado=" + lado ;
	}
	

	
	
}

