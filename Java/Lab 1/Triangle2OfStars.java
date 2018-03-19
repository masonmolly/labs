public class Triangle2OfStars{
   public static void main(String args []){
	 int i; 
	 int j;
     for(i=1; i<=6; i++) { 
        for (j=1; j<=i; j++) {
           System.out.print( "*" ); /*prints starts in triangle, increasing in 1 each time up to 6*/
        }
        System.out.println();
     }
     int k; 
     int l;
     for (k=6; k>=1; k--) { 
    	for (l=1; l<=k; l++) {
    	 	System.out.print(l); /*prints the number of how many there are, decreasing in 1 each time from 6->1 (upside down triangle)*/
    	}
    	System.out.println();
     }
   }
}

