
public class GratificacaoGerente implements Gratificacao {
	
        public double calcularGratificacao(Funcionario umFuncionario) {
            
        	try{
        		if (umFuncionario.getNivel() == 1) {
                    return umFuncionario.getSalarioBase() * 1.3;
                }else if (umFuncionario.getNivel() == 2) {
                    return umFuncionario.getSalarioBase() * 1.45;                 	  
                }
        		
        	}catch (Exception e) {
				e.printStackTrace();
			}
        	
            return umFuncionario.getSalarioBase();
      }
        
        
        
  }

