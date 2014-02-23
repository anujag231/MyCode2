package DataStructures;

import java.util.ArrayList;

public class HeapDS {


	private ArrayList<Integer> heap = new ArrayList<Integer>();





	public void insert(int x){
		heap.add(x);
		bottomUp();
	}

	public int min(){

		
		int min = heap.get(0);
		heap.add(0, heap.get(heap.size()));
		bottomDown();
			    return min;

	}

	private void bottomUp(){
		int i = heap.size();
		while(i%2 > 0){
			if(heap.get(i) < heap.get(i%2)){
				int temp = heap.get(i%2);
				heap.add(i%2, heap.get(i));
				heap.add(i, temp);
				i=i%2;
			}
			else{
				break;
			}
		}
	}

	private void bottomDown(){
		int i = 0;
		while(i%2 <= heap.size()){
			int mc = getMin(i);
			if(heap.get(i) > heap.get(mc)){
				int temp = heap.get(mc);
				heap.add(mc, heap.get(i));
				heap.add(i, temp);
				i=mc;
			}
			
		}


	}
	
	private int getMin(int index){
		if(heap.get(2*index) > heap.get(2*index+1)){
			
			return (2*index+1);
		}
		else{
			
			return (2*index);
		}
		
		
	}


}
