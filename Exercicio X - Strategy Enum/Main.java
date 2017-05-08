
public class Main {
	public static void main(String[] args) {
		Funcionario funcionarioDBA = new Funcionario(Cargos.DBA, 4000.00,1);
		System.out.println("DBA nível 1: "+ funcionarioDBA.calcularGratificacao());
		
		Funcionario funcionarioDBA2 = new Funcionario(Cargos.DBA, 4000.00,2);
		System.out.println("DBA nível 2: "+ funcionarioDBA2.calcularGratificacao());
		// 
		
		Funcionario funcionarioDesenvolvedor = new Funcionario(Cargos.DESENVOLVEDOR, 2500.00,1);
		System.out.println("Desenvolvedor nível 1: "+funcionarioDesenvolvedor.calcularGratificacao());
		
		Funcionario funcionarioDesenvolvedor2 = new Funcionario(Cargos.DESENVOLVEDOR, 2500.00,2);
		System.out.println("Desenvolvedor nível 2: "+funcionarioDesenvolvedor2.calcularGratificacao());
		//
		
		Funcionario funcionarioGerente = new Funcionario(Cargos.GERENTE, 5000.00,1);
		System.out.println("Gerente nível 1: "+funcionarioGerente.calcularGratificacao());
		
		Funcionario funcionarioGerente2 = new Funcionario(Cargos.GERENTE, 5000.00,2);
		System.out.println("Gerente nível 2: "+funcionarioGerente2.calcularGratificacao());
		// 
		
		Funcionario funcionarioLider = new Funcionario(Cargos.LIDER, 8000.00,1);
		System.out.println("Lider nível 1: "+funcionarioLider.calcularGratificacao());
		
		Funcionario funcionarioLider2 = new Funcionario(Cargos.LIDER, 8000.00,2);
		System.out.println("Lider nível 2: "+funcionarioLider2.calcularGratificacao());
		
	}
}