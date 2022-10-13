public class Facade {

	private String courseName;

	private Lecturer lecturer;

	private String gradingPolicy;

	private String integrityPolicy;

	private String generalPolicy;

	private Adapter adapter;
	public Facade() {
//		System.out.println("Facade Pattern started");
	}

	public void getPrevYearSyllabus() {
		System.out.println("Facade Pattern started");
		FullTimeProfessorDecorator professorDecorator = new FullTimeProfessorDecorator();
		professorDecorator.createSyllabus();

	}

	public void scrapeDataPrevYear() {

	}

	public void preview() {

	}

	public void getPolicies(String policy) {

	}

	public void getIntegrityPolicies() {

	}

	public void getGradingPolicies() {

	}

	public void getGeneralPolicies() {

	}



	public String getLecturerName() {
		return null;
	}

}
