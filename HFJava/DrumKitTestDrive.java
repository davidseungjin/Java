class DrumKitTestDrive{
	public static void main(String[] args){
		DrumKit d = new DrumKit();
		d.playSnare();
		//d.snare = false;
		d.playTopHat();

		if(d.snare == true){
			System.out.println("This is conditional statement: snare == true");
			d.playSnare();
		}
	}
}
