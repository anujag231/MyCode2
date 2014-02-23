package DataStructures;

import java.io.Serializable;

public class Set {
	
	
	
	private Set(){
		
		array = new HashEntry[100];
		clear();
	}
	
	
	
	  public void clear( )
	    {
	        currentSize = occupied = 0;
	        modCount++;
	        for( int i = 0; i < array.length; i++ )
	            array[ i ] = null;
	    }
	
	
	private static class HashEntry implements Serializable
	    {
	        public Object  element;   // the element
	        public boolean isActive;  // false if marked deleted

	        public HashEntry( Object e )
	        {
	            this( e, true );
	        }

	        public HashEntry( Object e, boolean i )
	        {
	            element  = e;
	            isActive = i;
	        }
	    }
	private HashEntry [] array;
	private int size;
	private int currentSize;
	private int occupied;
	private int modCount;
	

}
