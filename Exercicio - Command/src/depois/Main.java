package depois;

import java.util.LinkedList;

import antes.Giant;
import antes.Queue;

public class Main {
	
	public static void main(String[] args){
		
		 Queue<Giant> que = new Queue<Giant>();
	     Giant input[] = new Giant[8];
		 Giant bad_guy; 

		  for (int i = 0; i < 6; i++){
			que.enque(input[i]);
		  }

		  for (int i = 0; i < 6; i++){
			bad_guy = que.deque();
			if (bad_guy.get_type() == Type.fee){
			  bad_guy.fee();
			}
			else if (bad_guy.get_type() == tType.phi){
			  bad_guy.phi();
			}
			else if (bad_guy.get_type() == Type.pheaux){
			  bad_guy.pheaux();
			}
		  }
		  
		  System.out.print('\n');
		}
}
