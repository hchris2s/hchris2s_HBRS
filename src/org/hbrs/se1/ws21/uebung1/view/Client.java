package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.Translator;
import org.hbrs.se1.ws21.uebung1.control.TranslatorFactory;

public class Client {

	private com.sun.java.accessibility.util.Translator translator;

	/*
	 * Methode zur Ausgabe einer Zahl auf der Console
	 */
	public void display( int aNumber ){
		// In dieser Methode soll die Methode translateNumber 
		// mit dem ├╝bergegebenen Wert der Variable aNumber 
		// aufgerufen werden.
		//
		// Strenge Implementierung gegen das Interface Translator gewuenscht!

		Translator translator = TranslatorFactory.createGermanTranslator();

		System.out.println("Das Ergebnis der Berechnung: " +
				"[das Ergebnis an dieser Stelle]"  );

	}


	public void setTranslator(com.sun.java.accessibility.util.Translator translator) {
		this.translator = translator;
	}
}




