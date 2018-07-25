package pattern.classes.objetos;

import pattern.classes.characters.Personaje;

public class Espada extends PesonajeDecorador{

	Personaje mipersonaje;
	
	

public Espada(Personaje pmipersonaje) {	
	this.mipersonaje=pmipersonaje;
	
	
}



@Override
public String getPersonaje() {
	
	
	
	
	
	return mipersonaje.getNombre()+":"+" Vida: "+(mipersonaje.getVida()+1)
			+" Ataque: "+(mipersonaje.getAtaque()+10)
			+" Defensa: "+(mipersonaje.getDefensa()+10)
			+"Magia: "+mipersonaje.getMagia();
}






}
