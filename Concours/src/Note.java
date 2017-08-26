
public class Note {
	private int num_note;
	private String intitul_note;
	private Candidat candidat;
	private Equipe equipe;
	
	public Note(int num_note, String intitul_note, Candidat candidat,
			Equipe equipe) {
		super();
		this.num_note = num_note;
		this.intitul_note = intitul_note;
		this.candidat = candidat;
		this.equipe = equipe;
	}

	public Note(int num_note, String intitul_note) {
		super();
		this.num_note = num_note;
		this.intitul_note = intitul_note;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Note(int num_note, String intitul_note, Candidat candidat) {
		super();
		this.num_note = num_note;
		this.intitul_note = intitul_note;
		this.candidat = candidat;
	}

	public Note(int num_note) {
		super();
		this.num_note = num_note;
	}

	public int getNum_note() {
		return num_note;
	}

	public void setNum_note(int num_note) {
		this.num_note = num_note;
	}

	public String getIntitul_note() {
		return intitul_note;
	}

	public void setIntitul_note(String intitul_note) {
		this.intitul_note = intitul_note;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}
	
	protected void affiche(){
		
	System.out.println("intitul_note" +getIntitul_note());
}


}
