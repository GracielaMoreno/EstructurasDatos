package com.epn;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Aplicacion  {

	public static void main (String[] args) {
		
		Figura figura[] = new Figura[5];
		
		String salida ="";
				
		for (int i=0; i<figura.length;i++) {
			
			int opcion = JOptionPane.showOptionDialog(null, "Que figura desea ingresar?", "Menú", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Punto", "Circulo","Linea","Rectangulo","Cuadrado" }, "Punto");
			if (opcion == 0) {
	
				figura [i]= new Punto("punto");
			}
			
			if (opcion == 1) {
						
				figura [i] = new Circulo("l circulo");					
			}
		
			if (opcion == 2) {
				
				figura [i] = new Linea("linea");
			}
			if (opcion == 3) {
				
				figura [i] = new Rectangulo("rectangulo");
			}
			if (opcion == 4) {
				
				figura [i] = new Cuadrado("cuadrado");
			}
		}
		
		DecimalFormat formato = new DecimalFormat("0.00");
		for (int i=0; i<figura.length; i++) {
			
			salida += figura[i].getClass().getSimpleName()+":\n"+figura[i].toString();
			salida += "\nEl volumen es: "+formato.format(figura[i].getVolumen());
			salida += "\nEl area es: "+ formato.format(figura[i].getArea());
			salida += "\nEl perimetro es: "+formato.format(figura[i].getPerimetro())+"\n\n";
			JFrame aplicacion = new JFrame();
			aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			aplicacion.getContentPane().setBackground(Color.WHITE);
			aplicacion.setSize(400,500);
			aplicacion.add(figura[i]);
			aplicacion.setVisible(true);	
		}
				
		JOptionPane.showMessageDialog(null, salida);
	}
}


