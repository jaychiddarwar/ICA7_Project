public class FullTimeProfessorDecorator extends BaseDecorator {

	public FullTimeProfessorDecorator(){
		System.out.println("Decorator Pattern Started");
	}

	private Scraper scraper;

	/**
	 *  
	 */
	public void createSyllabus() {
		scraper = new Scraper();
		System.out.println("\nSyllabus is generated");
	}

	/**
	 *  
	 */
	public void modifySyllabus() {

	}

}
