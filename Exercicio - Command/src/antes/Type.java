package antes;

public enum Type {
	fee, 
	phi, 
	pheaux;
	
	public static final int SIZE = 10;
	
	public int getValue(){
		return this.ordinal();
	}

	public static Type forValue(int value){
		return values()[value];
	}
}
