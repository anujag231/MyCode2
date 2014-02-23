/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author agupta6
 */
public class CoinProb {
    
     
    
    public  int coinProb(int A , int [] s , int[] minchange){
        if(minchange[A] != 0) {
            return minchange[A];
        }
    if(A==0)
        return 0;
   int mincoins=Integer.MAX_VALUE;
    for(int i=0 ; i < s.length ; i++){
         if(s[i] >A) break;
     mincoins = Math.min(coinProb(A - s[i] , s , minchange ), minchange[A])+1;
     
     minchange[A] = mincoins;
     
   
    }
    return minchange[A];
    
    }
    
    
    
   public int count( int S[], int m, int n )
{
    int i, j, x, y;
 
    // We need n+1 rows as the table is consturcted in bottom up manner using 
    // the base case 0 value case (n = 0)
    int [][] table = new int[n+1][m];
    
    // Fill the enteries for 0 value case (n = 0)
    for (i=0; i<m; i++)
        table[0][i] = 1;
 
    // Fill rest of the table enteries in bottom up manner  
    for (i = 1; i < n+1; i++)
    {
        for (j = 0; j < m; j++)
        {
            // Count of solutions including S[j]
            x = (i-S[j] >= 0)? table[i - S[j]][j]: 0;
 
            // Count of solutions excluding S[j]
            y = (j >= 1)? table[i][j-1]: 0;
 
            // total count
            table[i][j] = x + y;
        }
    }
    return table[n][m-1];
}
   
   
   
   public static int Min_Coin(int []s,int sum)
{
	int [] min_coins= new int[sum+1];
	min_coins[0]=0;
	
	for(int i=1;i<min_coins.length;i++)
		min_coins[i]=Integer.MAX_VALUE;
	
	for(int i=1;i<=sum;i++)
		for(int j=0;j<s.length;j++)
			if((s[j]<=i) && (min_coins[i-s[j]]+1<min_coins[i]))
				min_coins[i]=min_coins[i-s[j]]+1;
	
	
	return min_coins[sum];
}
   
  public int maxSumIS( int A[], int n )
{
  int i=0;
  int sum[]= new int[10];
  for(i=1;i<n;i++)
  {
      if(sum[i-1] +A[i] > A[i]){
      sum[i]= sum[i-1] +A[i];
      }
      else{
      sum[i]= A[i];
      }
  
  }
  int max=0;
   for ( i = 0; i < n; i++ ){
      if ( max < sum[i] )
         max = sum[i];
   }
 
 
   return max;
}

    
}
