package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class SubString {
public static void main(String[] args) {
	String str= "abbbacctlkababcdjlkcccabcdaaabbbabcd";
	String temp = "abcd";
	Map<String,Integer> map = new HashMap<String,Integer>();
	int len = str.length();
	System.out.println(len);
	int templen = temp.length();
	for(int i=0;i<len-templen+1;i++){
		if(map.containsKey(str.substring(i,i+templen)))
		map.put(str.substring(i,i+templen), map.get(str.substring(i,i+templen))+1);
		else
			map.put(str.substring(i,i+templen), 1);	
		System.out.println(map.toString() +"\n");
	}
	//System.out.println(map.toString());
	
	
}}
