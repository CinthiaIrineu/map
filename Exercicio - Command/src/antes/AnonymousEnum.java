package antes;

import java.util.HashMap;

public class AnonymousEnum {

	public static final int SIZE = 8;
	private int intValue;	
	private static HashMap<Integer, AnonymousEnum> mappings;

	private static HashMap<Integer, AnonymousEnum> getMappings(){
		if (mappings == null){
			synchronized (AnonymousEnum.class){
				if (mappings == null){
					mappings = new HashMap<Integer, AnonymousEnum>();
				}
			}
		}
		return mappings;
	}

	private AnonymousEnum(int value){
		intValue = value;
		getMappings().put(value, this);
	}

	public int getValue(){
		return intValue;
	}

	public static AnonymousEnum forValue(int value){
		return getMappings().get(value);
	}
}