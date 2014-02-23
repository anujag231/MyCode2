package DataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class DAG {

	private HashMap<Integer,List<Integer>> outgoingMap = new HashMap<Integer,List<Integer>>();
	private HashMap<Integer,List<Integer>> incomingMap = new HashMap<Integer,List<Integer>>();




	public void insertInDAG(int source , int dest){
		List<Integer> values=null;
		if(outgoingMap.get(source) == null){
			values = new ArrayList<Integer>();
			values.add(dest);


		}else{
			values =outgoingMap.get(source);


		}
		outgoingMap.put(source, values);
		if(incomingMap.get(dest) == null){
			values = new ArrayList<Integer>();
			values.add(source);


		}else{
			values =incomingMap.get(dest);


		}
		incomingMap.put(dest, values);

	}


	public void topologicalSort(){
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (Entry<Integer, List<Integer>> entry : outgoingMap.entrySet())
		{
			if(!incomingMap.containsKey(entry.getKey())){

				set.add(entry.getKey());
			}
		}

		Iterator<Integer> it = set.iterator();
		if(set.isEmpty()){
			//error

		}
		while(it.hasNext()){
			Integer x = it.next();
			set.remove(x);
			list.add(x);
			List<Integer> incomingedges  = outgoingMap.get(x);

			for (Integer inm : incomingedges)
			{
				if(incomingMap.containsKey(inm)){
					List<Integer> edges =incomingMap.get(inm);
					if(edges != null && !edges.isEmpty())
						edges.remove(x);  
					else


						if(edges.isEmpty()){  set.add(inm);}
				}

			}
		}

	}
	





}
