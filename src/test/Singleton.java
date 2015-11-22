package test;

public class Singleton {
	private Singleton(){}
	private static Singleton instance = new Singleton();
	public static Singleton Instance(){
		return instance;
	}

}
