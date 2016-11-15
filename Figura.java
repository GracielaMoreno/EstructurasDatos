package com.epn;
import java.awt.Graphics;
import javax.swing.JPanel;

public abstract class Figura extends JPanel {

	public abstract double getVolumen();
	public abstract void dibujar(Graphics g);
	public abstract double getArea();
	public abstract double getPerimetro();
}

