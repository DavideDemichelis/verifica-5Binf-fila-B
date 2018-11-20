
// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 
package it.marconicivitavecchia.as2018_19.c5Binf.verifica;

import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(800,600);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new stringbuilder ();
		
		// TODO Creare la stringa HTML per il wireframe
		sb . append("<htmel>");
		sb . append("<body>");
		sb . append("<table=stile width (100%) >");
		sb . append("<tr><th><h1> live the company</h1></tr></th>");
		sb . append("<tr>");
		sb . append ("<th>");
		sb . append ("evento");
		sb . append ("</th>");
		sb . append ("data");
		sb . append ("</th>");
		sb . append ("vado?");
		sb . append ("</tr></th>");
		sb . append ("<tr><th>");
		sb . append ("cocktail party");
		sb . append ("</th>");
		sb . append ("7 dic");
		sb . append ("</th>");
		sb . append ("si");
		sb . append ("</th>");
		sb . append ("</tr>");
		
		
		// TODO Convertire lo StringBuilder in String
		String html = sb.toString();
		 
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(html));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

