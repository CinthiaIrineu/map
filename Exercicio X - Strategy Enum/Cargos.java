
public enum Cargos implements Gratificacao{	
	
	DBA {		
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
        
  },
   DESENVOLVEDOR {
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
        
  },
   GERENTE {
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
      
  },
   LIDER {
	public double calcularGratificacao(Funcionario umFuncionario) {
		try{
    		if (umFuncionario.getNivel() == 1) {
                return umFuncionario.getSalarioBase() * 1.25;
            }else if (umFuncionario.getNivel() == 2) {
                return umFuncionario.getSalarioBase() * 1.35;                 	  
            }
    		
    	}catch (Exception e) {
			e.printStackTrace();
		}
    	
        return umFuncionario.getSalarioBase();
		
	}
      
  };
}
