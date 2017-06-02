
public class Main {
	public static void main(String args[]){
		
		Pai pai = new Pai("João", 50);
		
		/*pai.setNome("");
		  pai.setIdade(0);*/
		
		Filho filho = new Filho("Carlos",20,"carlos@teste.com");
		
		/*filho.setNome("");
		  filho.setIdade(0);
		  filho.setEmail("");*/
		
		System.out.println(pai.dados());
		System.out.println(filho.dados());
		
	}
}
