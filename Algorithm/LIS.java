/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author agupta6
 */
public class LIS {
    
    
    
    
    public int Lis(int [] arr ,int n ,int max){
    
        
    Integer [] lis = new Integer[arr.length];
    String [] lisstr  = new String[arr.length];
            
    for(int p =0 ; p < arr.length ; p++){
          lis[p] = 1;
    
    }
    lisstr[0]= String.valueOf(arr[0]);
    for(int i =0 ; i < arr.length ; i++){
        
           for(int  j = 0 ; j < i ;j++){
               
               if(arr[i] > arr[j] && lis[i] <lis[j]+1) {
                   lis[i] = lis[j]+1;
                
                   lisstr[i] = String.valueOf( lisstr[j] ) + "," + arr[i];
               }
              
               
          }
          
    
    }
    int index =0;
    for(int i =0 ; i < arr.length ; i++){
           
    if(max < lis[i]) {
            max = lis[i];
            index = i;
        }
    
    }
    System.out.print("index  " + lisstr[index] );
    
        return max;
    
    
    }
    
}
