package DataStructures;

public class LinkListAlternateRev {
	
	
	
	
	
	public static void main(){
		
		Node h1 = new Node(0);
		Node h2 = new Node(1);
		Node h3 = new Node(2);
		Node h4 = new Node(3);
		Node h5 = new Node(4);
		Node h6 = new Node(5);
		Node h7 = new Node(6);
		Node h8 = new Node(7);
		h1.next = h2;
		h2.next = h3;
		h3.next = h4;
		h4.next = h5;
		h5.next = h6;
		h6.next = h7;
		h7.next = h8;
		h8.next = null;
		revList(h1);
	}
	
	
	public static void revList(Node head){
		Node tail = new Node(0);
		Node tempHead = head;
		
		while(tempHead.next != null){
			tail.data = tempHead.data;
			tail = tempHead.next;
			tempHead = tempHead.next;
			
			
		}
	tempHead= head;
		while(head != null && head.next != tail){
			if(head.next != null){
				Node temp =head.next;
				head.next = head.next.next;
				
			    if(tail.next != null){
			    	Node temp1 = tail.next;
			    	tail.next = temp;
			    	tail.next.next = temp1;
			    }else{
			    	tail.next = temp;
			    	tail.next.next = null;
			    }
			}
			head= head.next;
			
		}
		while(tempHead != null){
			System.out.print(tempHead.data);
			tempHead = tempHead.next;
			
		}
		
		
		
	}

}
