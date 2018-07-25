package pattern.classes.objetos;

import pattern.classes.characters.Personaje;

public class Escudo extends PesonajeDecorador{

	Personaje mipersonaje;
	
	

public Escudo(Personaje pmipersonaje) {	
	this.mipersonaje=pmipersonaje;
	
	
}

	@Override
	public String getPersonaje() {
		return mipersonaje.getNombre()+":"+" Vida: "+(mipersonaje.getVida()+10)
				+" Ataque: "+mipersonaje.getAtaque()
				+" Defensa: "+(mipersonaje.getDefensa()+40)+
				 " Magia: "+mipersonaje.getMagia();
	}

	
	
}
