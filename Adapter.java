public class Adapter extends Facade {

	public Adapter(){
		System.out.println("Adapter Pattern started");
		Facade facade = new Facade();
		facade.getPrevYearSyllabus();
	}

	private Canvas c;

	private Blackboard b;

	private Syllabus syllabus;

	private Facade facade;

	private Canvas canvas;

	private Blackboard blackboard;

	/**
	 *  
	 */
	public Canvas CanvasAdapter(String api) {
		return null;
	}

	/**
	 *  
	 */
	public Blackboard BlackboardAdapter(String api) {
		return null;
	}

}
