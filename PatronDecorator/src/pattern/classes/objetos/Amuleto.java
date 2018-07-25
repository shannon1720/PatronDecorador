package pattern.classes.objetos;

import pattern.classes.characters.Personaje;

public class Amuleto extends PesonajeDecorador {
	Personaje mipersonaje;

	public Amuleto(Personaje pmipersonaje) {
		this.mipersonaje = pmipersonaje;

	}

	@Override
		public String getPersonaje() {
			String personaje;
			if(!mipersonaje.getNombre().equals("Trabajador")) {
			
				personaje= mipersonaje.getNombre()+":"
						+ " Vida:"+mipersonaje.getVida()
				+" Ataque: "+mipersonaje.getAtaque()
				+" Defensa:"+mipersonaje.getDefensa()
				+" Magia:"+(mipersonaje.getMagia()+10);
		   }else{
				personaje=  mipersonaje.getNombre()+":"
						+ " Vida:"+mipersonaje.getVida()
				+" Ataque: "+mipersonaje.getAtaque()
				+" Defensa:"+mipersonaje.getDefensa()
				+" Magia"+mipersonaje.getMagia();
		}
		
		return personaje;
	
}}
