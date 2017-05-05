
public class GratificacaoDesenvolvedor implements Gratificacao {
                      
            public double calcularGratificacao(Funcionario umFuncionario) {
                
            	try{
            		if (umFuncionario.getNivel() == 1) {
                        return umFuncionario.getSalarioBase() * 1.15;
                    }else if (umFuncionario.getNivel() == 2) {
                        return umFuncionario.getSalarioBase() * 1.25;                 	  
                    }
            		
            	}catch (Exception e) {
					e.printStackTrace();
				}
            	
                return umFuncionario.getSalarioBase();
          }
}