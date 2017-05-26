package antes;

import java.lang.reflect.Type;

public class Giant {
		
	private int m_id;
	private static int s_next = 0;
	
	
		public Giant(){
			m_id = s_next++;
		}
		
		public final Type m_type(){
			return m_type();
		}
		
		public final void fee(){
			System.out.print(m_id);
			System.out.print("-fee");
		}
		
		public final void phi(){
			System.out.print(m_id);
			System.out.print("-phi");
		}
		
		public final void pheaux(){
			System.out.print(m_id);
			System.out.print("-pheaux");
		}

		
}
