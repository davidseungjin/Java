class DrumKit{
	boolean topHap = true;
	boolean snare = true;

	void playTopHat(){
		System.out.println("ding ding da-ding");
	}
}

class DrumKitTestDrive{
	public static void main(String[] args){
		DrumKit d = new DrumKit();
		d.playSnare();
		d.snare = false;
		d.playTopHat();

		if(d.snare == true){
			d.playSnare();
		}
	}
}
