
public class Topic2_Assign5 {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		instruments[0] = new Piano();
		instruments[1] = new Piano();
		instruments[2] = new Flute();
		instruments[3] = new Flute();
		instruments[4] = new Guitar();
		instruments[5] = new Guitar();
		instruments[6] = new Piano();
		instruments[7] = new Piano();
		instruments[8] = new Flute();
		instruments[9] = new Guitar();
		
		// checking for the polymorphic behavior of play method
		for(int i = 0; i<10; i++){
			instruments[i].play();
		}
		
		// instanceof 
		System.out.println("----------");
		for(int i = 0; i<10; i++){
			String x = instruments[i] instanceof Piano ? "is a Piano." : 
				(instruments[i] instanceof Flute ? "is a Flute." : 
					(instruments[i] instanceof Guitar ? "is a Guitar." : " not an instrument. "));
					System.out.println("Index: " + i + ", " + x);
		}

	}

}
