package live;

import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {
		Veena veena = new Veena();
		veena.play();
		
		Saxophone sax = new Saxophone();
		sax.play();
		
		Playable[] playable = new Playable[]{veena, sax};
		for(int i = 0; i < playable.length; i++){
			playable[i].play();
		}
	}


}
