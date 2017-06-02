
public class Pai implements Familia{
	private String nome;	
	private int idade;
	
	public Pai(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String dados() {
		return ("Nome: "+ nome + "   Idade: "+ idade);
	}
	
	

}
