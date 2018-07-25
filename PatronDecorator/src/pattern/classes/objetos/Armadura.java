package pattern.classes.objetos;

import pattern.classes.characters.Personaje;

public class Armadura extends PesonajeDecorador {


	Personaje mipersonaje;
	
	

public Armadura(Personaje pmipersonaje) {	
	this.mipersonaje=pmipersonaje;
	
	
}

	@Override
	public String getPersonaje() {
		return mipersonaje.getNombre()+":"+" Vida: "+(mipersonaje.getVida()+20)
				+" Ataque: "+mipersonaje.getAtaque()
				+" Defensa: "+(mipersonaje.getDefensa()+20)
				+" Magia: "+mipersonaje.getMagia();
	}

	

}
