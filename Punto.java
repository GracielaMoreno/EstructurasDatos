package com.epn;
import java.awt.Color;
import java.awt.Graphics;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;


public class Punto extends Figura {
	
	private int x;
	private int y;
	
	public Punto(String cadena) {
		super();
		String punto="";
		punto = JOptionPane.showInputDialog("Ingrese el "+cadena+". Ej: X,Y");
		StringTokenizer tokens = new StringTokenizer(punto,",");
		this.x = Integer.parseInt(tokens.nextToken());
		this.y = Integer.parseInt(tokens.nextToken());
	}

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	

	@Override
	public double getVolumen() {
		return 0;
	}

	@Override
	public void dibujar (Graphics g) {
	
		g.setColor(Color.CYAN);
		g.fillOval(x, y, 5, 5);
	}
	
	public void paintComponent (Graphics g) {
		
		dibujar(g);
	}

	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimetro() {
		return 0;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
