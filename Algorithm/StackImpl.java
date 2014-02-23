package DataStructures;

import java.util.LinkedList;
import java.util.Queue;


public class StackImpl {
	
	private Queue<Integer> queue1 = new LinkedList<Integer>();
	private Queue<Integer> queue2 = new LinkedList<Integer>();
	
	
	public void push(Integer x){
		
		if(queue1.size() == 0){
			
			queue1.add(x);
			MoveQItems(queue2, queue1);
		}else{
			
			
			queue2.add(x);
			MoveQItems(queue1, queue2);
					
			
		}
		
		
	}
	
	public void Pop()
    {
        if (queue1.size()!= 0)
        {
           System.out.print(queue1.poll());
        }
        else if (queue2.size() != 0)
        {
        	 System.out.print(queue2.poll());
        }
        
    }
	
	 private void MoveQItems(Queue<Integer> a, Queue<Integer> b)
     {
         while (a.size() != 0)
         {
             b.add(a.poll());
         }
     }
	

}
