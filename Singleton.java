public class Singleton {

	private Singleton instance;

	private String date;

	/**
	 *  
	 *  
	 */
	private Singleton() {
		System.out.println("Singleton Pattern started");
	}

	public static Singleton Instance() {
		return new Singleton();
	}

}
