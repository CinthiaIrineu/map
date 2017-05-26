package antes;

import java.lang.reflect.Type;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args){ 
		
        Queue<Giant> que = new Queue<Giant>();
        Giant input[] = new Giant[8];
		Giant bad_guy;    


		  for (int i = 0; i < 6; i++){
			que.enque(input[i]);
		  }

		  for (int i = 0; i < 6; i++){
			  bad_guy = new Queue<Giant>().deque();
			  
				if (bad_guy.m_type() == Type.fee){
				  bad_guy.fee();
				}
				else if (bad_guy.get_type() == Type.phi){
				  bad_guy.phi();
				}
				else if (bad_guy.get_type() == Type.pheaux){
				  bad_guy.pheaux();
				}
		  }
		
		
		
		
		
		
		
		
		
		
		
		
		
	}			
}
