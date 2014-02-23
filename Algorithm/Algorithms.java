/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author agupta6
 */
public class Algorithms {

//   
//     * @param args the command line arguments
//    
//    public static void main(String[] args) {
//        
//        
//        
//        // TODO code application logic here
//        int [] s  = {1,2,3};
//        int [] m ={ 0,0,0,0,0,0 ,0,0,0,0,0,0,0,0};
//        CoinProb coinprob = new CoinProb();
//        //System.out.print(coinprob.count( s , 3, 4));
//        System.out.print(coinprob.coinProb( 10 , s, m));
//        
//    } 
//    
//    
//    public static void main(String args[])
//{
//	
//            
//    int [] s  = {1,2,3};
//    
//    System.out.println("\nThe minimum number of coins required for a change of  is :"+new CoinProb().Min_Coin(s,10));
//    
//
//}
//
//
//public static void main(String args[])
//{
//	
//
//  int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
//    System.out.println("\nThe LIS is :"+new LIS().Lis(arr, arr.length, 0));
//    
//
//}
//    
    
  public static void main(String args[])
{
  int arr[] = {-2,-3,4,-1,-2,1,5,-3};
 CoinProb coinprob = new CoinProb();
  System.out.println("Sum of maximum sum increasing subsequence is "+
         coinprob.maxSumIS( arr, 8 ) );
 
 
}
   
}
