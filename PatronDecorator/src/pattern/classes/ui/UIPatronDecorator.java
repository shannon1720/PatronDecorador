package pattern.classes.ui;

import pattern.classes.characters.Mago;
import pattern.classes.objetos.Amuleto;

public class UIPatronDecorator {

	public static void main(String[] args) {
Mago miMago=new Mago();



Amuleto miamuleto=new Amuleto(miMago);
System.out.println(miamuleto.getPersonaje());
	}

}
