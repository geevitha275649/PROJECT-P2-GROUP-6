public class Travel {

	private String Date;
	private String Name;
	private String IC;
	private String PA;
	private String DOB;
	private String POB;
	private String EA;
	private String Opinion;
	
	 
	public Travel(String date, String name, String iC, String pA, String dOB, String pOB, String eA,  String opinion) {
		super();
		Date = date;
		Name = name;
		IC = iC;
		PA = pA;
		DOB = dOB;
		POB = pOB;
		EA = eA;
		Opinion = opinion;
	}


	public String getDate() {
		return Date;
	}


	public void setDate(String date) {
		Date = date;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getIC() {
		return IC;
	}


	public void setIC(String iC) {
		IC = iC;
	}


	public String getPA() {
		return PA;
	}


	public void setPA(String pA) {
		PA = pA;
	}


	public String getDOB() {
		return DOB;
	}


	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getPOB() {
		return POB;
	}


	public void setPOB(String pOB) {
		POB = pOB;
	}

	public String getEA() {
		return EA;
	}


	public void setEA(String eA) {
		EA = eA;
	}

	public String getOpinion() {
		return Opinion;
	}


	public void setOpinion(String opinion) {
		Opinion = opinion;
	}

	
}
