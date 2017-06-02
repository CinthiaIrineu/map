
public class Filho extends Pai implements Familia{
	
	private String email;
	
	public Filho(String nome, int idade, String email) {
		super(nome, idade);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String dados() {
		return ("Nome: "+this.getNome()+ "  Idade: "+this.getIdade()+ "  Email: "+ email);
	}
	
	
	
	
	


}
